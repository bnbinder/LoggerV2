successful(?) logger

stuff.java contains a script for writing and retriving the files to and from the roborio. Must run the script on the computer, not the roborio. If one knows how to access files on the roborio and send them to a computer from the roborio, pls give code :)

Java Best Language, who needs JavaScript
⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣠⣤⣤⣤⠴⠶⠶⠶⠶⠒⠾⠿⠿⠿⣛⡛⠛⠛⠛⠛⠛⠻⠿⡷⠶⠶⢶⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠀⠀⢀⣤⡾⠟⠛⠉⣉⣩⣤⡴⠦⠭⠥⠒⠒⠒⠒⠒⠒⠒⠒⠂⠤⠀⢀⣀⠈⠑⠢⢀⠑⠀⠀⠙⢿⣄⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⣠⡾⠟⠁⣠⡢⠔⢫⠞⣉⣀⡀⠀⠀⠀⠐⠒⠄⠠⠀⠀⠐⡠⢂⡴⠶⠦⢴⡊⠙⠒⠀⠑⠀⠀⠀⠀⠹⣧⡀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⢠⣿⠀⡠⢊⡫⡀⢀⣤⣞⣡⣼⣿⣦⠀⠐⠉⠱⡤⢢⠦⠀⠀⣰⠋⣀⣤⣴⣿⣿⣆⠀⠀⠀⠀⠀⠀⠙⠳⢾⣷⡀⠀⠀⠀⠀⠀
⠀⠀⠀⣼⡏⣰⠁⠠⠪⠿⣟⠩⠉⠀⠀⠈⢻⡧⠄⣴⠞⠁⣣⠖⠀⢰⣧⠞⠁⠀⠠⠍⡻⣼⡆⠀⢀⣀⡀⠀⠀⠀⠀⠙⣧⡀⠀⠀⠀⠀
⠀⣴⡾⠟⣽⢋⡒⠦⡢⠐⠀⠄⠒⠲⠶⠖⠋⠀⢸⡇⠀⠀⠙⠀⠀⠘⣷⡀⠤⠤⠀⠀⠀⠉⠛⠻⡍⠀⠐⠉⣉⣗⠦⣄⠘⢿⣦⡀⠀⠀
⣾⠋⠀⢸⠇⢹⠟⢦⣄⡀⠄⠀⠀⠉⠁⣰⠶⢖⣾⠁⠀⠀⠀⠐⠒⢦⣤⣝⠓⠒⠒⠊⠀⠈⠀⠀⢀⣴⠞⠋⣽⢻⠱⡈⢳⡈⢯⠻⣦⠀
⣿⠀⡆⠸⣆⢸⡦⡄⠉⠛⠶⣬⣔⡀⠘⠁⢸⡏⠁⠀⠀⠶⢦⣤⡀⠈⡇⠈⠳⠄⠀⢀⠀⠀⣀⡴⢿⠥⣄⣼⠃⡌⠀⢳⠀⢳⠸⡄⠘⣧
⣿⡀⡇⠀⠈⠷⣇⡗⣦⣠⡀⠈⠙⠛⡿⠶⠾⢿⣶⣶⣶⣶⣀⣀⣁⣀⣁⣀⣠⣤⣿⠿⠟⠛⣉⣀⡏⢀⡿⠁⠰⠀⠀⢸⠀⠀⠀⡇⠀⣿
⠘⣷⡁⢀⢸⠀⣿⠀⡟⠀⣷⠋⢳⡾⠙⢷⡀⠀⣠⠤⣌⠉⠉⣉⣭⣍⠉⣩⠭⢤⣀⡴⠚⢲⡇⠀⣿⠏⠀⠠⠃⠀⠀⣸⠀⠀⠀⠁⣼⠏
⠀⠘⣷⢸⠈⡆⣿⣿⣁⢀⠏⠀⢸⡇⠀⠀⢻⣾⠁⠀⠈⢳⣴⠏⠀⠹⣶⠇⠀⠀⢹⡀⣀⣼⣷⡾⠃⢠⠀⢀⠄⠀⠠⠁⠀⠀⣀⣼⠋⠀
⠀⠀⢸⣿⠀⡇⣿⣿⣿⣿⣤⣄⣼⠃⠀⠀⢸⡟⠀⠀⠀⠀⣿⠀⠀⠀⣿⡀⠀⢀⣿⣿⣿⣿⡟⠁⢠⠃⠀⠀⠀⡀⠀⠀⢀⣼⠟⠁⠀⠀
⠀⠀⢸⣿⠀⡇⣿⣿⣿⣿⣿⣿⣿⣷⣶⣦⣿⣧⣀⣀⣤⣤⣿⣶⣶⣶⣿⣿⣿⣿⣿⣿⡿⣫⠄⢀⠂⠀⠀⠀⠀⡄⠀⢠⣿⠁⠀⠀⠀⠀
⠀⠀⢸⣿⠀⣧⣿⠻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⣩⠞⠁⡰⠁⠀⠠⠀⠀⡐⠀⢠⡾⠃⠀⠀⠀⠀⠀
⠀⠀⢸⡇⠀⣿⡟⢀⡟⠀⣿⠋⢻⡿⠻⣿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⢁⡔⠁⠠⠞⠀⠀⠀⠁⢀⠌⢀⣴⠟⠁⠀⠀⠀⠀⠀⠀
⠀⠀⣼⠃⡄⢹⣿⡙⢇⣠⡇⠀⣸⠁⢠⠇⠀⢹⠃⢠⠛⠙⡏⠉⣇⣼⠿⢃⡴⠋⠀⠐⠁⠔⠀⠐⠁⣠⣢⣴⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⣿⠀⡇⠸⡿⢷⣄⡀⠙⠒⠳⡤⠼⣄⣀⢼⣀⢾⣀⣸⣶⡾⠟⣁⡴⠋⢀⡠⠒⠁⠀⠀⢀⣤⡾⠟⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⣿⠀⠻⡄⠉⠠⡉⠙⠳⠶⣶⣶⣶⣾⣷⣶⠿⠿⠟⠋⠉⠖⠫⠕⠒⠈⠀⢀⣤⣴⡶⠟⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⢿⡄⠀⠉⠓⠀⠀⠈⠉⠠⠌⠀⠀⠀⣀⠠⠄⠂⠠⠤⠤⠴⠊⠁⣀⣴⡾⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠈⠻⣦⣑⠒⠤⣅⣀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⣤⣶⠶⠶⠛⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀
⠀⠀⠀⠀⠈⠙⠛⠶⠶⣤⣭⣭⣭⣭⣴⠶⠶⠛⠛⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀

https://www.codejava.net/java-se/ftp/java-ftp-file-download-tutorial-and-example
https://docs.wpilib.org/en/stable/docs/software/roborio-info/roborio-ftp.html
https://www.codejava.net/java-se/ftp/use-urlconnection-to-download-file-from-ftp-server
https://stackoverflow.com/questions/29542498/download-copy-file-from-ftp-server-in-java
https://github.com/RobotCasserole1736/RobotCasserole2020/blob/ac2b684dcb55423456a04409782656e690a973c7/logFileSnagger/file_snagger/snag_files.py
https://www.chiefdelphi.com/t/way-to-save-data-from-the-roborio-to-a-file-txt-or-json-on-the-driver-station-laptop/390670/5
https://stemrobotics.cs.pdx.edu/node/7149
