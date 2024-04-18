def call(Map args) {
    sh "ansible-playbook -i /var/lib/jenkins/workspace/ScyllaDB-cluster-role/inventory /var/lib/jenkins/workspace/ScyllaDB-cluster-role/test.yml"
}