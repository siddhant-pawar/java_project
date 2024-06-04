# UDP Chat Application

This is a simple UDP-based chat application that allows two clients to communicate with each other.

## Overview

This chat application consists of two Java programs: `ClientA` and `ClientB`. `ClientA` sends messages to `ClientB`, and `ClientB` responds back to `ClientA`. The communication is done using UDP sockets.

## How to Use

1. Compile the Java files:
    ```bash
    javac ClientA.java
    javac ClientB.java
    ```

2. Run the client programs:
    - Open two terminal windows or tabs.
    - In one window, run `ClientA`:
        ```bash
        java ClientA
        ```
    - In the other window, run `ClientB`:
        ```bash
        java ClientB
        ```

3. Start chatting! Type your message in one client, press Enter, and see the response in the other client.

## Requirements

- Java Development Kit (JDK) installed on your system.
- Network connectivity between the two clients.

## Note

- This chat application uses a simple peer-to-peer (P2P) approach. There's no central server involved; communication is direct between the two clients.

