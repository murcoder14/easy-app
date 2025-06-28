pipeline {
    agent any
    
    options {
        timeout(time: 3, unit: 'MINUTES')
        disableConcurrentBuilds()
    }

    tools {
        maven 'Maven 3.9.10'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Compiling..'
                sh 'mvn compile'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh 'mvn clean test'
            }
        }
        stage('Package') {
            steps {
                echo 'Packaging....'
                sh 'GIT_SHORT_COMMIT=$(echo $GIT_COMMIT | cut -c 1-7)
                mvn versions:set -DnewVersion="$GIT_SHORT_COMMIT"
                mvn versions:commit'
                sh 'mvn package -DskipTests'
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
        }
    }

    post {
        success {
            echo 'Build, Test, and Package stages completed successfully!'
        }
        failure {
            echo 'One or more stages failed. Please check the logs.'
        }
        always {
            echo 'This will always execute, regardless of the build result.'
        }
    }
}