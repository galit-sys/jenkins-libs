def call(Map config = [:]0 {
  def scriptcontents = libraryResources "resources/org/foo/${config.name}"
  writeFile file: "${config.name}", text: scriptscontents
}
