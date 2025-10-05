package com.rajeev.MatchWithAiBackend.matches;

import com.rajeev.MatchWithAiBackend.profiles.Profile;

public record Match (String id, Profile profile, String conversationId) {
}
