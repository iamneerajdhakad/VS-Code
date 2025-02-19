#include <iostream>
#include <string>
#include <cctype>
#include <unordered_set>

using namespace std;

// Function to check if a word is a reserved keyword in C++
bool isKeyword(const string &word) {
    unordered_set<string> keywords = {
        "auto", "break", "case", "char", "const", "continue", "default", "do", "double", 
        "else", "enum", "extern", "float", "for", "goto", "if", "int", "long", "register", 
        "return", "short", "signed", "sizeof", "static", "struct", "switch", "typedef", 
        "union", "unsigned", "void", "volatile", "while", "class", "private", "public", 
        "protected", "virtual", "friend", "template", "inline", "namespace", "using", 
        "bool", "nullptr", "true", "false", "new", "delete", "this", "throw", "try", 
        "catch", "operator", "export", "mutable", "typeid"
    };

    return keywords.find(word) != keywords.end();
}

// Function to check if a word is a valid identifier
bool isValidIdentifier(const string &word) {
    // Check if the word is a keyword
    if (isKeyword(word)) {
        return false;
    }

    // Check if the first character is a letter or underscore
    if (!(isalpha(word[0]) || word[0] == '_')) {
        return false;
    }

    // Check if the rest of the characters are alphanumeric or underscore
    for (size_t i = 1; i < word.length(); i++) {
        if (!(isalnum(word[i]) || word[i] == '_')) {
            return false;
        }
    }

    return true;
}

int main() {
    string word;

    // Input the word to be checked
    cout << "Enter a word: ";
    cin >> word;

    // Check if the word is a valid identifier
    if (isValidIdentifier(word)) {
        cout << "\"" << word << "\" is a valid identifier." << endl;
    } else {
        cout << "\"" << word << "\" is NOT a valid identifier." << endl;
    }

    return 0;
}
