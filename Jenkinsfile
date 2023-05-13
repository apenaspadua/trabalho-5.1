pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        
        stage('Compile') {
            steps {
                sh 'javac -version' // Verifica a versão do Java instalada
                sh 'java -jar trabalho5.1.jar' // Compila o código fonte
            }
        }
    }
}
