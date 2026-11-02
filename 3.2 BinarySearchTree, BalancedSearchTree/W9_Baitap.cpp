#include<bits/stdc++.h>

using namespace std;

const int N = 2e5 + 7;

int n, nQuery, nextSibling[N], firstChild[N];

void add(int u, int v) {
    nextSibling[v] = firstChild[u];
    firstChild[u] = v;
}

void input() {
    cin >> n;
    int u, v;
    //nhap vao cac canh, voi u la cha, v la con cua u
    for(int i = 1; i < n; i++) {
        cin >> u >> v;
        add(u, v);
    }
}

int findParent(int u) {
    for(int i = 1; i <= n; i++) {
        if(firstChild[i] == 0) continue;
        int j = firstChild[i];
        do {
            if(j == u) return i;
            j = nextSibling[j];
        } while(j != 0);
    }
    return -1;
}

void solve() {
    cin >> nQuery;
    int u;
    for(int i = 1; i <= nQuery; i++) {
        cin >> u;
        cout << findParent(u) << '\n'; 
    }
}

int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    input();
    solve();
    return 0;
}  