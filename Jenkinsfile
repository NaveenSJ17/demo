pipeline {
    agent any

    tools {
        maven 'Maven-3.9.11'   // match the Maven tool name in Jenkins
    }

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/NaveenSJ17/demo.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }

        stage('Deploy to Staging') {
            steps {
                // Example for Windows (adjust as per your env)
                bat 'copy target\\app.jar C:\\deployments\\app.jar'
                // If deploying to remote server, you’d use WinSC
