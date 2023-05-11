#!/usr/bin/env groovy

node {
    stage("Check Out") {
        echo "Checking out from Git Repository"
        checkout scm
    }


    stage("Java Version") {
        echo "Checking out for Java version"
        bat "java -version"
    }

    stage('Gradle Building ') {
        echo 'Cleaning the repository'
        bat "./gradlew clean"
        echo "Building the jar"
        bat "./gradlew bootjar"
    }

    stage("Deploying the Cloud") {
        bat "ssh -i C:\Users\kouyd\.ssh/gcp-backend-key backend@34.64.98.92 mkdir /home/backend/test"
//         sh 'ssh -i ~/.ssh/gcp-backend-key  backend@34.64.240.208 mkdir -p /home/backend/apipartner'
//         sh 'scp -i ~/.ssh/gcp-backend-key  build/libs/*.jar backend@34.64.240.208:/home/backend/apipartner'
//         sh 'scp -i ~/.ssh/gcp-backend-key  startApti.sh backend@34.64.240.208:/home/backend/apipartner'
//         sh 'ssh -i ~/.ssh/gcp-backend-key  backend@34.64.240.208 chmod +x /home/backend/apipartner/startApti.sh'
//         sh 'ssh -i ~/.ssh/gcp-backend-key  backend@34.64.240.208 /home/backend/apipartner/startApti.sh'
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
