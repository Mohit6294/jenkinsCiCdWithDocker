// pipeline{
//
//     agent any
//     tools{
//         maven "Maven"
//     }
//     stages{
//
//         stage("SCM checkout"){
//             steps{
//             checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Mohit6294/jenkinsCiCdWithDocker.git']])
//             }
//         }
//         stage("Build Process"){
//             steps{
//                 bat 'mvn clean install'
//             }
//         }
//         stage("build docker image"){
//                     steps{
//                         script{
//                             bat 'docker build -t mohit4619/spring-cicd:1.0 .'
//                         }
//                     }
//         }
//
//
//
//
//     }
//     /*
//     post{
//         always{
//             emailext attachLog: true, body: '''<html>
//     <body>
//        <p>Build Status: ${BUILD_STATUS}</p>
//        <p>Build Number: ${BUILD_NUMBER}</p>
//        <p>Check the <a href="${BUILD_URL">console output</a></p>
//     </body>
// </html>''', mimeType: 'text/html', replyTo: 'bhadanimohit1997@gmail.com', subject: 'Pipeline Status : ${BUILD_NUMBER}', to: 'bhadanimohit1997@gmail.com'
//         }
//     }
//     */
//
// }
//
// // SCM checkout
// // build
// // deploy the WAR
// // Email