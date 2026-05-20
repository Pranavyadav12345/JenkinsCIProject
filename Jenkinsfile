pipeline {

    agent any

    tools {

        maven 'Maven'
    }

    stages {

        stage('Check Java') {

            steps {

                sh 'java -version'
            }
        }

        stage('Check Maven') {

            steps {

                sh 'mvn -version'
            }
        }

        stage('Build') {

            steps {

                sh 'mvn clean compile'
            }
        }

        stage('Test') {

            steps {

                sh 'mvn test'
            }
        }

        stage('Package') {

            steps {

                sh 'mvn package'
            }
        }
    }

    post {

        success {

            echo 'Build Successful'
        }

        failure {

            echo 'Build Failed'
        }
    }
}