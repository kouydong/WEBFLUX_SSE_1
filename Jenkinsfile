#!/usr/bin/env groovy

node {
    stage("check out") {
        echo "Git Repository checkout 합니다."
        checkout scm
    }

    stage("java version") {
        echo "Java Version 확인 합니다."
        bat java -version
    }

    stage('Test') {
        echo 'Testing....'
    }

//     stage('execute sh') {
// 		sh "chmod 774 ./project.sh"
//         sh "./project.sh"
//     }
}

// node {
//     stage('checkout') {
//         checkout scm
//     }
//
//     stage('check java') {
// //         sh "whoami"
//         sh "java -version"
//     }

//
//     stage('Gradle Build') {
//         sh "chmod +x gradlew"
//         sh "./gradlew clean build -x test "
//     }
//
//     stage('deploy') {
//         sh 'ssh -i ~/.ssh/gcp-backend-key backend@34.64.240.208 rm -rf /home/backend/apipartner'
//         sh 'ssh -i ~/.ssh/gcp-backend-key  backend@34.64.240.208 mkdir -p /home/backend/apipartner'
//         sh 'scp -i ~/.ssh/gcp-backend-key  build/libs/*.jar backend@34.64.240.208:/home/backend/apipartner'
//         sh 'scp -i ~/.ssh/gcp-backend-key  startApti.sh backend@34.64.240.208:/home/backend/apipartner'
//         sh 'ssh -i ~/.ssh/gcp-backend-key  backend@34.64.240.208 chmod +x /home/backend/apipartner/startApti.sh'
//         sh 'ssh -i ~/.ssh/gcp-backend-key  backend@34.64.240.208 /home/backend/apipartner/startApti.sh'
//     }
// }
