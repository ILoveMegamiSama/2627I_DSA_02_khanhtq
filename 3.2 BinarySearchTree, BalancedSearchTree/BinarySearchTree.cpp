//cay tim kiem nhi phan binh thuong, cai dat bang con tro

#include<bits/stdc++.h>

using namespace std;

const int N = 2e5 + 7;

int n, a[N];

struct BSTNode {
    //gia tri cua node
    int data;
    
    //con tro toi node con trai
    BSTNode* left;
    //con tro toi node con phai
    BSTNode* right;

    BSTNode(int val) {
        data = val;
        left = NULL;
        right = NULL;
    }

    static BSTNode* insert(BSTNode *root, int val) {
        if(root == NULL) {
            return new BSTNode(val); 
        }
        if(root->data > val) {
            root->left = insert(root->left, val);
        } else root->right = insert(root->right, val);
    
        return root;
    }

    static void printTree(BSTNode *root) {
        if(root->left != NULL) printTree(root->left);
        if(root->right != NULL) printTree(root->right);
        cout << root->data << " ";
    }
};

void input() {
    //xay cay tim kiem nhi phan tu mang nay
    cin >> n;
    for(int i = 1; i <= n; i++) {
        cin >> a[i];
    }
}

void solve() {
    BSTNode* root = NULL;
    for(int i = 1; i <= n; i++) {
        root = BSTNode::insert(root, a[i]);
    } 
    BSTNode::printTree(root);
}

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    input();
    solve();
    return 0;
}