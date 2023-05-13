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
        
        stage('Test') {
            steps {
                sh 'java -jar org.junit.runner.JUnitCore com.example.trabalho04.AnuncianteBeanTest.java' // Executa os testes JUnit
                sh 'java -jar org.junit.runner.JUnitCore com.example.trabalho04.AnuncioBeanTest.java' // Executa os testes JUnit
                sh 'java -jar org.junit.runner.JUnitCore com.example.trabalho04.ProdutoBeanTest.java' // Executa os testes JUnit
            }
        }
    }
}
