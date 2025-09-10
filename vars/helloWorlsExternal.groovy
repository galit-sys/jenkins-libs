def call(Map config = [:]){
  loadLinuxScript(name: 'hello0-worls.bat')
  bat "./hello-world.bat ${config.name} ${config.dayOfWeek}"
}
