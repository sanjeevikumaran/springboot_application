pipeline {
    agent any
    stages {
        stage('Example clean') {
            steps {
               sh "mvn clean"
            }
        }
        stage('Example install') {
            steps {
                sh "mvn install"
                echo "Build successfully finished"
            }
        }
        stage('Example deploy') {
            steps {
                cd /var/lib/jenkins/workspace/springboot-build/target
                cp -v file-demo-0.0.1-SNAPSHOT.jar /home/ubuntu/Documents/
                cd /home/ubuntu/Documents
                scp -P 32 -i Deployserver.pem -o StrictHostKeyChecking=no file-demo-0.0.1-SNAPSHOT.jar ubuntu@13.251.140.214:/home/ubuntu/Documents/

                  }
                }
              }
           }
