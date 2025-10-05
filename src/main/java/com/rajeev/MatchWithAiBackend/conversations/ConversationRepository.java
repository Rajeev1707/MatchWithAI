package com.rajeev.MatchWithAiBackend.conversations;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConversationRepository extends MongoRepository<Conversation, String> {
}
