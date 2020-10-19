pipeline{
       agent any
       stages {
              stage('Build') {
                steps 
                     {
                  sh 'mvn clean install'
		     }//End of steps	     
 post {
        always {
                archiveArtifacts artifacts: 'build/libs/**/*.jar', fingerprint: true
		junit 'build/reports/**/*.xml'
	        }
      }	 
	       }//End of stage build
             }//End of stages
          }//End of pipeline
