INSERT INTO user_secret VALUES
    (
        1,
        '6cc23ff9-79ac-4ee4-be0f-22d6679fc2e4',
        true,
        'SUPERUSER',
        '$2a$08$Rt0AsbUU4ELmvezc0M45OuZiHNwDxhewyRI3Q47dsVZosY7atzqv2' --m_32_fq_222_fp!pa
    ) ON CONFLICT (id) DO NOTHING;