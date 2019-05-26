package consumerapp.wiranata.com;

import android.database.Cursor;

interface LoadNotesCallback {
    void postExecute(Cursor notes);
}