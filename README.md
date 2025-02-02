# Media Player System - A Java Interface-Based Implementation

## Overview
This project demonstrates the use of interfaces in Java to create a modular and scalable media player system. The system simulates the behavior of different types of media players (audio, video, and streaming) using a common interface. This design allows new types of players to be added easily without modifying the existing codebase.

---

## Features
The system includes:
1. **MediaPlayer Interface**: Defines the common behavior for all media players (`play`, `pause`, `stop`).
2. **AudioPlayer**: Simulates an audio player for playing music files.
3. **VideoPlayer**: Simulates a video player for streaming movies or TV shows.
4. **StreamingPlayer**: Simulates a streaming player for live events or online content.
5. **MediaPlayerDemo**: A main class to test the functionality of the media players.

---

## Code Structure
The project consists of the following files:
1. **MediaPlayer.java**: Interface defining the contract for media players.
2. **AudioPlayer.java**: Implementation for audio playback.
3. **VideoPlayer.java**: Implementation for video playback.
4. **StreamingPlayer.java**: Implementation for streaming media.
5. **MediaPlayerDemo.java**: Main class to test the system.

---

## How to Run the Program

    Prerequisites:

        Ensure you have Java Development Kit (JDK) installed on your system.

        Use an IDE like IntelliJ IDEA or a text editor with a Java compiler.

    Steps:

        Clone or download the project files.

        Open the project in your IDE or text editor.

        Compile and run the MediaPlayerDemo class.

Explanation of Key Concepts

    Interfaces:

        The MediaPlayer interface defines a contract (play, pause, stop) that all media players must follow.

        This ensures consistency and allows new players to be added easily.

    Implementation Classes:

        Each class (AudioPlayer, VideoPlayer, StreamingPlayer) provides its own logic for the interface methods.

        Example: VideoPlayer prints "Buffering..." on pause(), while AudioPlayer uses "Paused."

    Testing:

        Normal Tests: Simulate typical usage (play → pause → stop).

        Edge Tests: Handle unusual scenarios (empty titles, pausing/stopping without starting).
