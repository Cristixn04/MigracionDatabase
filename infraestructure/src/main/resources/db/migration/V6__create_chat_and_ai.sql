-- V6: Chat, Mensajería y Modelos de Inteligencia Artificial

CREATE TABLE IF NOT EXISTS priorities (
    id UUID PRIMARY KEY,
    name_priority VARCHAR(50) NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS conversations_statuses (
    id UUID PRIMARY KEY,
    name_status VARCHAR(50) NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS sender_types (
    id UUID PRIMARY KEY,
    name_type VARCHAR(50) NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS message_types (
    id UUID PRIMARY KEY,
    name_type VARCHAR(50) NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS chat_conversations (
    id UUID PRIMARY KEY,
    conversation_status_id UUID NOT NULL REFERENCES conversations_statuses(id),
    priority_id UUID NOT NULL REFERENCES priorities(id),
    last_message_at TIMESTAMP,
    closed BOOLEAN DEFAULT FALSE,
    closed_at TIMESTAMP,
    closed_by UUID,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS chat_participants (
    id UUID PRIMARY KEY,
    conversation_id UUID NOT NULL REFERENCES chat_conversations(id) ON DELETE CASCADE,
    participant_type_id UUID NOT NULL REFERENCES sender_types(id),
    patient_id UUID REFERENCES patients(id),
    professional_id UUID REFERENCES professionals(id),
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS chat_messages (
    id UUID PRIMARY KEY,
    conversation_id UUID NOT NULL REFERENCES chat_conversations(id) ON DELETE CASCADE,
    message_type_id UUID NOT NULL REFERENCES message_types(id),
    participant_id UUID NOT NULL REFERENCES chat_participants(id),
    content JSONB NOT NULL,
    metadata JSONB,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS provider_models_ai (
    id UUID PRIMARY KEY,
    name_provider_ai VARCHAR(100) NOT NULL,
    razon_social VARCHAR(100),
    sitio_web TEXT,
    is_active BOOLEAN NOT NULL DEFAULT TRUE,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS ai_models (
    id UUID PRIMARY KEY,
    provider_model_id UUID NOT NULL REFERENCES provider_models_ai(id),
    name_model VARCHAR(100) NOT NULL,
    model_key VARCHAR(120) NOT NULL,
    input_token_price DECIMAL(12,8) NOT NULL DEFAULT 0,
    output_token_price DECIMAL(12,8) NOT NULL DEFAULT 0,
    max_tokens INTEGER,
    context_window INTEGER,
    is_active BOOLEAN NOT NULL DEFAULT TRUE,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS chat_conversation_ai_settings (
    id UUID PRIMARY KEY,
    conversation_id UUID NOT NULL REFERENCES chat_conversations(id) ON DELETE CASCADE,
    ai_enabled BOOLEAN NOT NULL DEFAULT TRUE,
    default_model_id UUID NOT NULL REFERENCES ai_models(id),
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS ai_runs_statuses (
    id UUID PRIMARY KEY,
    name_status VARCHAR(50) NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS chat_ai_runs (
    id UUID PRIMARY KEY,
    conversation_id UUID NOT NULL REFERENCES chat_conversations(id) ON DELETE CASCADE,
    message_id UUID NOT NULL REFERENCES chat_messages(id),
    model_id UUID NOT NULL REFERENCES ai_models(id),
    ai_run_status_id UUID NOT NULL REFERENCES ai_runs_statuses(id),
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS chat_ai_run_metrics (
    id UUID PRIMARY KEY,
    ai_run_id UUID NOT NULL REFERENCES chat_ai_runs(id) ON DELETE CASCADE,
    prompt_tokens INTEGER NOT NULL DEFAULT 0,
    completion_tokens INTEGER NOT NULL DEFAULT 0,
    total_tokens INTEGER NOT NULL DEFAULT 0,
    cost DECIMAL(10,6) NOT NULL DEFAULT 0,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS chat_ai_run_errors (
    id UUID PRIMARY KEY,
    ai_run_id UUID NOT NULL REFERENCES chat_ai_runs(id) ON DELETE CASCADE,
    error_message TEXT NOT NULL,
    error_code VARCHAR(80),
    provider_error_id VARCHAR(120),
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS escalations_statuses (
    id UUID PRIMARY KEY,
    name_status VARCHAR(50) NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS chat_escalations (
    id UUID PRIMARY KEY,
    conversation_id UUID NOT NULL REFERENCES chat_conversations(id) ON DELETE CASCADE,
    status_id UUID NOT NULL REFERENCES escalations_statuses(id),
    from_ai BOOLEAN NOT NULL DEFAULT FALSE,
    reason TEXT,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS chat_escalation_assignments (
    id UUID PRIMARY KEY,
    escalation_id UUID NOT NULL REFERENCES chat_escalations(id) ON DELETE CASCADE,
    professional_id UUID NOT NULL REFERENCES professionals(id),
    assigned_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE IF NOT EXISTS chat_escalation_status_history (
    id UUID PRIMARY KEY,
    escalation_id UUID NOT NULL REFERENCES chat_escalations(id) ON DELETE CASCADE,
    escalation_status_id UUID NOT NULL REFERENCES escalations_statuses(id),
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    changed_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);
