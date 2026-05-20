pipeline {

    agent any

    stages {

        stage('Check Java') {

            steps {

                bat 'java -version'
            }
        }

        stage('Check Maven') {

            steps {

                bat 'mvn -version'
            }
        }

        stage('Build') {

            steps {

                bat 'mvn clean compile'
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