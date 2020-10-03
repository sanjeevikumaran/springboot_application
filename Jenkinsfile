def buildNumber = env.BUILD_NUMBER as int
if (buildNumber > 8) milestone(buildNumber - 1)
milestone(buildNumber)


pipeline {
    agent any
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building'
                sh 'mvn clean install'
            }
        }
        
         stage('Deploy') {
            steps {
		    echo 'Deploying' 
    sh 'sudo chown jenkins:jenkins /home/sanjeevi/codebase/simtuitive-core-backend/target/classes/application.properties'
		sh 'sudo chmod 755 /home/sanjeevi/codebase/simtuitive-core-backend/target/classes/application.properties'
    sh 'sudo chown jenkins:jenkins /home/sanjeevi/codebase/simtuitive-core-backend/target/maven-status/maven-compiler-plugin/compile/default-compile/inputFiles.lst'
    sh 'sudo chmod 755 /home/sanjeevi/codebase/simtuitive-core-backend/target/maven-status/maven-compiler-plugin/compile/default-compile/inputFiles.lst'
		sh 'sudo chown jenkins:jenkins /home/sanjeevi/codebase/simtuitive-core-backend/target/maven-status/maven-compiler-plugin/testCompile/default-testCompile/inputFiles.lst'
    sh 'sudo chmod 755 /home/sanjeevi/codebase/simtuitive-core-backend/target/maven-status/maven-compiler-plugin/testCompile/default-testCompile/inputFiles.ls'
		sh 'sudo chown jenkins:jenkins /var/log/simtuitive-api/'
	  sh 'sudo chmod 755 /var/log/simtuitive-api/'
    sh 'cd /var/log/simtuitive-api/ && sudo rm -rf *.log'
		sh 'sudo kill -9 $(sudo lsof -t -i:9080)'
		//port = sudo kill -9 $(sudo lsof -t -i:9080)
		 //if (   )
     sh 'cd /home/sanjeevi/codebase/simtuitive-core-backend && mvn spring-boot:run'   
                    } // End of steps
                    
         }//End Of Deploy Stage
       }//End Of Stages
    }//End of pipeline
