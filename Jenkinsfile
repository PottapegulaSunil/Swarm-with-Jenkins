pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Assuming you are using Git for version control
                dir('student-rest') {
                    git branch: 'main', url: 'https://github.com/PottapegulaSunil/Swarm-with-Jenkins.git'
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                // Build your Docker image here, assuming your Dockerfile is in the "student-rest" subdirectory
                script {
                    sh 'docker build --tag=sunil2580/student-rest1:latest .'
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                script {
                    withCredentials([string(credentialsId: 'DockerHub-Pwd', variable: 'DockerHubPwd')]) {
                        sh 'docker login -u sunil2580 -p ${DockerHubPwd}'
                        sh 'docker push sunil2580/student-rest1'
                    }
                }
            }
        }
    }
}
