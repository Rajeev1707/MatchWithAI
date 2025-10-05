MatchWithAI

A full-stack Tinder-like app powered by AI, built with Spring Boot and React.

Overview

MatchWithAI generates fictional profiles and enables AI-driven conversations. Profile pictures are created using Stable Diffusion, and conversations are powered by GPT-4 or Ollama.

Features

Backend with Spring Boot and MongoDB

Frontend with React (SPA, responsive)

AI-generated profiles and images

AI-powered chat with unique personalities

Setup

Clone the repo

Add profile data

Copy profile.json to backend/

Copy images to backend/src/main/resources/static/images/

Configure user profile
Edit backend/src/main/resources/application.properties:



Set API key

OpenAI: SPRING_AI_OPEN_AI_API_KEY environment variable

Or set up Ollama locally

Run backend

cd backend
mvn spring-boot:run


Run frontend

cd frontend
npm install
npm start


Open http://localhost:3000
 in your browser.
