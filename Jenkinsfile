pipeline {
    agent any
    
    environment {
        APP_NAME = "spring-docker-cicd"
        RELEASE_NO = "1.0.0"
        DOCKER_USER = "mohit4619"
        IMAGE_NAME = "${DOCKER_USER}/${APP_NAME}"
        IMAGE_TAG = "${RELEASE_NO}-${BUILD_NUMBER}"
    }
    
    stages {
        stage("SCM checkout") {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Mohit6294/jenkinsCiCdWithDocker.git']])
            }
        }
        stage("Build Process") {
            steps {
                bat 'mvn clean install'
            }
        }
        stage("build docker image") {
            steps {
                script {
                    bat 'docker build -t %IMAGE_NAME%:%IMAGE_TAG% .'
                }
            }
        }
        stage("push the image to docker-hub") {
            steps {
                withCredentials([string(credentialsId: 'mohit-cred', variable: 'mohit-cred')]) {
                    bat 'docker login -u mohit4619 -p %mohit-cred%'
                    bat 'docker push %IMAGE_NAME%:%IMAGE_TAG%'
                }
            }
        }
    }
}
