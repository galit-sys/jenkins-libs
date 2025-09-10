def call(Map config = [:]){
  loadLinuxScript(name: 'hello0-worls.bat')
  bat "./hello-worls.bat ${config.name} ${config.dayOfWeek}"
