FROM openjdk:slim
# FROM openjdk:17.0.2-slim

RUN apt update \
    && apt install -y --no-install-recommends \
    apt-utils \
    git \
    build-essential \
    ca-certificates \
    procps \
    && apt autoremove -y \
    && apt clean -y \
    && rm -rf /var/lib/apt/lists/*
