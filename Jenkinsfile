stage 'Build'

node {
  try {
    notifyBuild('STARTED')

    /* ... existing build steps ... */

     sh'mvn clean'
     sh 'mvn install'




  } catch (e) {
    // If there was an exception thrown, the build failed
    currentBuild.result = "FAILED"
    throw e
  } finally {
    // Success or failure, always send notifications
    notifyBuild(currentBuild.result)
  }
}

def notifyBuild(String buildStatus = 'STARTED') {
  // build status of null means successful
  buildStatus = buildStatus ?: 'SUCCESS'

  // Default values
  //def colorName = 'RED'
  //def colorCode = '#FF0000'
  //def subject = "${buildStatus}: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]'"
  //def summary = "${subject} (${env.BUILD_URL})"
  //def email = 'sanjeevikumaran52@gmail.com'
  //def details = """<p>STARTED: Job '${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>
    //<p>Check console output at &QUOT;<a href='${env.BUILD_URL}'>${env.JOB_NAME} [${env.BUILD_NUMBER}]</a>&QUOT;</p>"""

stage'Push finder'    
              {
           steps {
                checkout changelog: true, poll: false, scm: [$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: []]
                script {
                     Author_ID=sh(script: "git show -s --pretty=%an", returnStdout: true).trim()
                     Author_Name=sh(script: "git show -s --pretty=%ae", returnStdout: true).trim()
                       }
                echo "${Author_ID}"               echo "${Author_ID} and ${Author_Name}"
                 }
              }   

            post {
              always {
                  mail to: 'sanjeevikumaran52@gmail.com',
                 subject: "Jenkins Build ${currentBuild.currentResult}: Job ${env.JOB_NAME}",
           body: "${currentBuild.currentResult}: Job ${env.JOB_NAME} build ${env.BUILD_NUMBER}\n More info at: ${env.BUILD_URL}";
                     }
                 }
}
