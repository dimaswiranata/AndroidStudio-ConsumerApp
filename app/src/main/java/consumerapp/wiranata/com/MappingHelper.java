package consumerapp.wiranata.com;

import android.database.Cursor;

import consumerapp.wiranata.com.entity.NoteItem;

import java.util.ArrayList;

import static android.provider.BaseColumns._ID;
import static consumerapp.wiranata.com.db.DatabaseContract.NoteColumns.TITLE;
import static consumerapp.wiranata.com.db.DatabaseContract.NoteColumns.DESCRIPTION;
import static consumerapp.wiranata.com.db.DatabaseContract.NoteColumns.DATE;

public class MappingHelper {

    public static ArrayList<NoteItem> mapCursorToArrayList(Cursor notesCursor) {
        ArrayList<NoteItem> notesList = new ArrayList<>();

        while (notesCursor.moveToNext()) {
            int id = notesCursor.getInt(notesCursor.getColumnIndexOrThrow(_ID));
            String title = notesCursor.getString(notesCursor.getColumnIndexOrThrow(TITLE));
            String description = notesCursor.getString(notesCursor.getColumnIndexOrThrow(DESCRIPTION));
            String date = notesCursor.getString(notesCursor.getColumnIndexOrThrow(DATE));
            notesList.add(new NoteItem(id, title, description, date));
        }

        return notesList;
    }
}
