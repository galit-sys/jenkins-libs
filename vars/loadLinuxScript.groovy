def call(Map config = [:]) {
  def scriptcontents = libraryResources "resources/org/foo/${config.name}"
  writeFile file: "${config.name}", text: scriptscontents
}
