pipeline {
    agent any


    stages {

        stage('run backend') {
              steps {
                  echo 'executing gradle...'
                  withGradle(){
                    sh './gradlew -v'
                  }
              }
        }
    }
}
