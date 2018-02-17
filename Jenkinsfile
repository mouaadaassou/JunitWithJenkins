pipeline {
  agent any
  stages {
    stage('Docker Version') {
      parallel {
        stage('Docker Version') {
          steps {
            sh 'docker --version'
          }
        }
        stage('check java version') {
          steps {
            sh 'java -version'
          }
        }
        stage('check maven version') {
          steps {
            sh 'mvn --version'
          }
        }
      }
    }
    stage('Build') {
      steps {
        sh 'mvn clean compile'
      }
    }
    stage('Test') {
      steps {
        sh 'mvn clean test'
      }
    }
    stage('Deploy') {
      steps {
        sh 'mvn clean install'
      }
    }
  }
}