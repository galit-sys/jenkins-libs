def call(Map config =[:]) {
  bat "echo hello ${config.name}. Today is ${config.dayOfWeek}"
}
