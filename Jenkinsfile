pipeline {
    agent any

    tools {
        maven 'Maven-3.9.11'
    }

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/NaveenSJ17/demo.git'
            }
        }

        stage('Build') {
            steps {
                dir('bookmydoctor') {
                    bat 'mvn clean install'
                }
            }
        }

        stage('Test') {
            steps {
                dir('bookmydoctor') {
                    bat 'mvn test'
                }
            }
        }

        stage('Package') {
            steps {
                dir('bookmydoctor') {
                    bat 'mvn package'
                }
            }
        }
    }

    post {
        success {
            echo 'Pipeline executed successfully!'
        }
        failure {
            echo 'Pipeline failed. Please check logs!'
        }
    }
}
