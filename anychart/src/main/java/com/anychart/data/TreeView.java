package com.anychart.data;

import com.anychart.APIlib;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.JsObject;
import com.anychart.core.Base;

import java.util.Locale;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import android.text.TextUtils;

// class
/**
 * TreeView. Class of mapped tree.
 */
public class TreeView extends Base {

    protected TreeView() {

    }

    public static TreeView instantiate() {
        return new TreeView("new anychart.data.treeView()");
    }

    

    public TreeView(String jsChart) {
        jsBase = "treeView" + ++variableIndex;
        APIlib.getInstance().addJSLine(jsBase + " = " + jsChart + ";");
    }

    public String getJsBase() {
        return jsBase;
    }

    
    /**
     * Adds a child.
     */
    public com.anychart.data.treeview.DataItem addChild(String child) {
        return new com.anychart.data.treeview.DataItem(String.format(Locale.US, jsBase + ".addChild(%s)", wrapQuotes(child)));
    }
    /**
     * Adds a child.
     */
    public com.anychart.data.treeview.DataItem addChild(com.anychart.data.tree.DataItem child) {
        return new com.anychart.data.treeview.DataItem(String.format(Locale.US, jsBase + ".addChild(%s)", (child != null) ? child.getJsBase() : null));
    }
    /**
     * Adds a child.
     */
    public com.anychart.data.treeview.DataItem addChild(com.anychart.data.treeview.DataItem child) {
        return new com.anychart.data.treeview.DataItem(String.format(Locale.US, jsBase + ".addChild(%s)", (child != null) ? child.getJsBase() : null));
    }
    /**
     * Inserts a child into a specified position.
     */
    public com.anychart.data.treeview.DataItem addChildAt(String child, Number index) {
        return new com.anychart.data.treeview.DataItem(String.format(Locale.US, jsBase + ".addChildAt(%s, %s)", wrapQuotes(child), index));
    }
    /**
     * Inserts a child into a specified position.
     */
    public com.anychart.data.treeview.DataItem addChildAt(com.anychart.data.tree.DataItem child, Number index) {
        return new com.anychart.data.treeview.DataItem(String.format(Locale.US, jsBase + ".addChildAt(%s, %s)", (child != null) ? child.getJsBase() : null, index));
    }
    /**
     * Inserts a child into a specified position.
     */
    public com.anychart.data.treeview.DataItem addChildAt(com.anychart.data.treeview.DataItem child, Number index) {
        return new com.anychart.data.treeview.DataItem(String.format(Locale.US, jsBase + ".addChildAt(%s, %s)", (child != null) ? child.getJsBase() : null, index));
    }
    /**
     * 
     */
    public com.anychart.data.TreeView addData(List<DataEntry> data) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".addData(%s);", arrayToString(data)));

        return this;
    }
    /**
     * Gets the child by index.
     */
    public com.anychart.data.treeview.DataItem getChildAt(Number index) {
        return new com.anychart.data.treeview.DataItem(String.format(Locale.US, jsBase + ".getChildAt(%s)", index));
    }
    /**
     * Returns a roots array.
     */
    public void getChildren() {
        APIlib.getInstance().addJSLine(jsBase + ".getChildren();");
    }
    /**
     * Creates tree view data traverser.
     */
    public com.anychart.data.Traverser getTraverser() {
        return new com.anychart.data.Traverser(jsBase + ".getTraverser()");
    }
    /**
     * Gets the index of child in a children array.
     */
    public void indexOfChild(com.anychart.data.tree.DataItem child) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".indexOfChild(%s);", (child != null) ? child.getJsBase() : null));
    }
    /**
     * Gets the index of child in a children array.
     */
    public void indexOfChild(com.anychart.data.treeview.DataItem child) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".indexOfChild(%s);", (child != null) ? child.getJsBase() : null));
    }
    /**
     * Returns a length of roots array.
     */
    public void numChildren() {
        APIlib.getInstance().addJSLine(jsBase + ".numChildren();");
    }
    /**
     * Removes data item's child.
     */
    public com.anychart.data.treeview.DataItem removeChild(com.anychart.data.tree.DataItem child) {
        return new com.anychart.data.treeview.DataItem(String.format(Locale.US, jsBase + ".removeChild(%s)", (child != null) ? child.getJsBase() : null));
    }
    /**
     * Removes data item's child.
     */
    public com.anychart.data.treeview.DataItem removeChild(com.anychart.data.treeview.DataItem child) {
        return new com.anychart.data.treeview.DataItem(String.format(Locale.US, jsBase + ".removeChild(%s)", (child != null) ? child.getJsBase() : null));
    }
    /**
     * Removes child at the specified position.
     */
    public com.anychart.data.treeview.DataItem removeChildAt(Number index) {
        return new com.anychart.data.treeview.DataItem(String.format(Locale.US, jsBase + ".removeChildAt(%s)", index));
    }
    /**
     * Removes children.
     */
    public com.anychart.data.TreeView removeChildren() {
        APIlib.getInstance().addJSLine(jsBase + ".removeChildren();");

        return this;
    }
    /**
     * Removes all listeners from an object. You can also optionally remove listeners of some particular type.
     */
    public void removeAllListeners(String type) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", wrapQuotes(type)));
    }
    public void setOnClickListener(com.anychart.chart.common.listener.ListenersInterface.OnClickListener listener) {
        StringBuilder js = new StringBuilder();

        js.append(jsBase).append(".listen('pointClick', function(e) {");

        if (listener.getFields() != null) {
            js.append("var result = ");
            for (String field : listener.getFields()) {
                js.append(String.format(Locale.US, "'%1$s' + ':' + e.point.get('%1$s') + ',' +", field));
            }
            js.setLength(js.length() - 8);
            js.append(";");

            js.append("android.onClick(result);");
        } else {
            js.append("android.onClick(null);");
        }
        js.append("});");

        com.anychart.chart.common.listener.ListenersInterface.getInstance().setOnClickListener(listener);

        APIlib.getInstance().addJSLine(js.toString());
    }
    /**
     * Removes an event listener which was added with listen() by the key returned by listen() or listenOnce().
     */
    public void unlistenByKey(String key) {
        APIlib.getInstance().addJSLine(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", wrapQuotes(key)));
    }

}