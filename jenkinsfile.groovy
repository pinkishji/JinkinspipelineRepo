pipeline{
agent none
stages{
stage('Build'){
steps{
echo "build is cretaed successfully"
}
}
stage('Test'){
steps{
echo "testing is done successfully"
}
}
stage('Deploy'){
steps{
echo "deployment is done successfully"
}
}
stage('Release'){
steps{
echo "Release is done successfully"
}
}
}
}


