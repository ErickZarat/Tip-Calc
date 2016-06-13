package org.erickzarat.android.tipcalc.fragments;

import org.erickzarat.android.tipcalc.models.TipRecord;

/**
 * Created by erick on 2/06/16.
 */
public interface TipHistoryListFragmentListener {
    void addToList(TipRecord record);
    void clearList();
}
