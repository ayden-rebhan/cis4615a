public void deleteFile() {
    File someFile = new File ("someFileName.txt" );
    // Do something with someFile
    if (!someFile.delete()) {
        deleteFile(someFile);
    }
}