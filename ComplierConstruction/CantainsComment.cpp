#include <iostream>
#include <string>
#include <algorithm>

bool containsComment(const std::string& line) {
    // Check for single-line comments (//)
    size_t singleLineCommentPos = line.find("//");

    // Check for multi-line comment markers (/* ... */)
    size_t multiLineStartPos = line.find("/*");
    size_t multiLineEndPos = line.find("*/");

    // If either single-line or multi-line markers are found, return true
    if (singleLineCommentPos != std::string::npos || 
        (multiLineStartPos != std::string::npos && multiLineEndPos == std::string::npos) ||
        (multiLineStartPos != std::string::npos && multiLineEndPos != std::string::npos && multiLineEndPos > multiLineStartPos)) {
        return true;
    }

    return false;
}

int main() {
    std::string line;
    std::cout << "Enter a line of code: ";
    std::getline(std::cin, line);

    if (containsComment(line)) {
        std::cout << "The line contains a comment." << std::endl;
    } else {
        std::cout << "The line does not contain a comment." << std::endl;
    }

    return 0;

}