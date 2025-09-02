def call(Map config = [:]) {
    echo "Hello, ${config.name ?: 'World'}, from me, shared-library!"
}