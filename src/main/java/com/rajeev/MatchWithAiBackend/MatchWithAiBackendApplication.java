package com.rajeev.MatchWithAiBackend;

import com.rajeev.MatchWithAiBackend.conversations.ConversationRepository;
import com.rajeev.MatchWithAiBackend.matches.MatchRepository;
import com.rajeev.MatchWithAiBackend.profiles.ProfileCreationService;
import com.rajeev.MatchWithAiBackend.profiles.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MatchWithAiBackendApplication implements CommandLineRunner {

	@Autowired
	private ProfileRepository profileRepository;
	@Autowired
	private ConversationRepository conversationRepository;
	@Autowired
	private MatchRepository matchRepository;

	@Autowired
	private ProfileCreationService profileCreationService;

	public static void main(String[] args) {
		SpringApplication.run(MatchWithAiBackendApplication.class, args);
	}

	public void run(String... args) {
		clearAllData();
		profileCreationService.saveProfilesToDB();

	}

	private void clearAllData() {
		conversationRepository.deleteAll();
		matchRepository.deleteAll();
		profileRepository.deleteAll();
	}

}
