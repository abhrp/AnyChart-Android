package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

// class
public class MapSeriesBubble extends JsObject {

    private String jsBase;

    public MapSeriesBubble() {

    }

    protected MapSeriesBubble(String jsBase) {
        this.jsBase = jsBase;
    }

    
    private Double bottom;
    private String bottom1;

    public void setBottom(Double bottom) {
        if (jsBase == null) {
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom = bottom;
        } else {
            this.bottom = bottom;

            js.append(String.format(Locale.US, jsBase + ".bottom(%f);", bottom));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bottom(%f);", bottom));
                js.setLength(0);
            }
        }
    }


    public void setBottom(String bottom1) {
        if (jsBase == null) {
            this.bottom = null;
            this.bottom1 = null;
            
            this.bottom1 = bottom1;
        } else {
            this.bottom1 = bottom1;

            js.append(String.format(Locale.US, jsBase + ".bottom(%s);", bottom1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bottom(%s);", bottom1));
                js.setLength(0);
            }
        }
    }

    private Bounds getBounds;

    public Bounds getBounds() {
        if (getBounds == null)
            getBounds = new Bounds(jsBase + ".bounds()");

        return getBounds;
    }

    private RectObj bounds;
    private AnychartMathRect bounds1;
    private Bounds bounds2;

    public void setBounds(RectObj bounds) {
        if (jsBase == null) {
            this.bounds = null;
            this.bounds1 = null;
            this.bounds2 = null;
            
            this.bounds = bounds;
        } else {
            this.bounds = bounds;

            js.append(String.format(Locale.US, jsBase + ".bounds(%s);", (bounds != null) ? bounds.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s);", (bounds != null) ? bounds.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setBounds(AnychartMathRect bounds1) {
        if (jsBase == null) {
            this.bounds = null;
            this.bounds1 = null;
            this.bounds2 = null;
            
            this.bounds1 = bounds1;
        } else {
            this.bounds1 = bounds1;

            js.append(String.format(Locale.US, jsBase + ".bounds(%s);", (bounds1 != null) ? bounds1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s);", (bounds1 != null) ? bounds1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setBounds(Bounds bounds2) {
        if (jsBase == null) {
            this.bounds = null;
            this.bounds1 = null;
            this.bounds2 = null;
            
            this.bounds2 = bounds2;
        } else {
            this.bounds2 = bounds2;

            js.append(String.format(Locale.US, jsBase + ".bounds(%s);", (bounds2 != null) ? bounds2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s);", (bounds2 != null) ? bounds2.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Double x;
    private String x1;
    private Double y;
    private String y1;
    private Double width;
    private String width1;
    private Double height;
    private String height1;

    public void setBounds(Double x, Double y, Double width, Double height) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x = x;
            this.y = null;
            this.y1 = null;
            
            this.y = y;
            this.width = null;
            this.width1 = null;
            
            this.width = width;
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;

            js.append(String.format(Locale.US, jsBase + ".bounds(%f, %f, %f, %f);", x, y, width, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%f, %f, %f, %f);", x, y, width, height));
                js.setLength(0);
            }
        }
    }


    public void setBounds(Double x, Double y, Double width, String height1) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x = x;
            this.y = null;
            this.y1 = null;
            
            this.y = y;
            this.width = null;
            this.width1 = null;
            
            this.width = width;
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height1 = height1;

            js.append(String.format(Locale.US, jsBase + ".bounds(%f, %f, %f, %s);", x, y, width, height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%f, %f, %f, %s);", x, y, width, height1));
                js.setLength(0);
            }
        }
    }


    public void setBounds(Double x, Double y, String width1, Double height) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x = x;
            this.y = null;
            this.y1 = null;
            
            this.y = y;
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.x = x;
            this.y = y;
            this.width1 = width1;
            this.height = height;

            js.append(String.format(Locale.US, jsBase + ".bounds(%f, %f, %s, %f);", x, y, width1, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%f, %f, %s, %f);", x, y, width1, height));
                js.setLength(0);
            }
        }
    }


    public void setBounds(Double x, Double y, String width1, String height1) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x = x;
            this.y = null;
            this.y1 = null;
            
            this.y = y;
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.x = x;
            this.y = y;
            this.width1 = width1;
            this.height1 = height1;

            js.append(String.format(Locale.US, jsBase + ".bounds(%f, %f, %s, %s);", x, y, width1, height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%f, %f, %s, %s);", x, y, width1, height1));
                js.setLength(0);
            }
        }
    }


    public void setBounds(Double x, String y1, Double width, Double height) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x = x;
            this.y = null;
            this.y1 = null;
            
            this.y1 = y1;
            this.width = null;
            this.width1 = null;
            
            this.width = width;
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.x = x;
            this.y1 = y1;
            this.width = width;
            this.height = height;

            js.append(String.format(Locale.US, jsBase + ".bounds(%f, %s, %f, %f);", x, y1, width, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%f, %s, %f, %f);", x, y1, width, height));
                js.setLength(0);
            }
        }
    }


    public void setBounds(Double x, String y1, Double width, String height1) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x = x;
            this.y = null;
            this.y1 = null;
            
            this.y1 = y1;
            this.width = null;
            this.width1 = null;
            
            this.width = width;
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.x = x;
            this.y1 = y1;
            this.width = width;
            this.height1 = height1;

            js.append(String.format(Locale.US, jsBase + ".bounds(%f, %s, %f, %s);", x, y1, width, height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%f, %s, %f, %s);", x, y1, width, height1));
                js.setLength(0);
            }
        }
    }


    public void setBounds(Double x, String y1, String width1, Double height) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x = x;
            this.y = null;
            this.y1 = null;
            
            this.y1 = y1;
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.x = x;
            this.y1 = y1;
            this.width1 = width1;
            this.height = height;

            js.append(String.format(Locale.US, jsBase + ".bounds(%f, %s, %s, %f);", x, y1, width1, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%f, %s, %s, %f);", x, y1, width1, height));
                js.setLength(0);
            }
        }
    }


    public void setBounds(Double x, String y1, String width1, String height1) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x = x;
            this.y = null;
            this.y1 = null;
            
            this.y1 = y1;
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.x = x;
            this.y1 = y1;
            this.width1 = width1;
            this.height1 = height1;

            js.append(String.format(Locale.US, jsBase + ".bounds(%f, %s, %s, %s);", x, y1, width1, height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%f, %s, %s, %s);", x, y1, width1, height1));
                js.setLength(0);
            }
        }
    }


    public void setBounds(String x1, Double y, Double width, Double height) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x1 = x1;
            this.y = null;
            this.y1 = null;
            
            this.y = y;
            this.width = null;
            this.width1 = null;
            
            this.width = width;
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.x1 = x1;
            this.y = y;
            this.width = width;
            this.height = height;

            js.append(String.format(Locale.US, jsBase + ".bounds(%s, %f, %f, %f);", x1, y, width, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s, %f, %f, %f);", x1, y, width, height));
                js.setLength(0);
            }
        }
    }


    public void setBounds(String x1, Double y, Double width, String height1) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x1 = x1;
            this.y = null;
            this.y1 = null;
            
            this.y = y;
            this.width = null;
            this.width1 = null;
            
            this.width = width;
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.x1 = x1;
            this.y = y;
            this.width = width;
            this.height1 = height1;

            js.append(String.format(Locale.US, jsBase + ".bounds(%s, %f, %f, %s);", x1, y, width, height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s, %f, %f, %s);", x1, y, width, height1));
                js.setLength(0);
            }
        }
    }


    public void setBounds(String x1, Double y, String width1, Double height) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x1 = x1;
            this.y = null;
            this.y1 = null;
            
            this.y = y;
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.x1 = x1;
            this.y = y;
            this.width1 = width1;
            this.height = height;

            js.append(String.format(Locale.US, jsBase + ".bounds(%s, %f, %s, %f);", x1, y, width1, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s, %f, %s, %f);", x1, y, width1, height));
                js.setLength(0);
            }
        }
    }


    public void setBounds(String x1, Double y, String width1, String height1) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x1 = x1;
            this.y = null;
            this.y1 = null;
            
            this.y = y;
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.x1 = x1;
            this.y = y;
            this.width1 = width1;
            this.height1 = height1;

            js.append(String.format(Locale.US, jsBase + ".bounds(%s, %f, %s, %s);", x1, y, width1, height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s, %f, %s, %s);", x1, y, width1, height1));
                js.setLength(0);
            }
        }
    }


    public void setBounds(String x1, String y1, Double width, Double height) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x1 = x1;
            this.y = null;
            this.y1 = null;
            
            this.y1 = y1;
            this.width = null;
            this.width1 = null;
            
            this.width = width;
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.x1 = x1;
            this.y1 = y1;
            this.width = width;
            this.height = height;

            js.append(String.format(Locale.US, jsBase + ".bounds(%s, %s, %f, %f);", x1, y1, width, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s, %s, %f, %f);", x1, y1, width, height));
                js.setLength(0);
            }
        }
    }


    public void setBounds(String x1, String y1, Double width, String height1) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x1 = x1;
            this.y = null;
            this.y1 = null;
            
            this.y1 = y1;
            this.width = null;
            this.width1 = null;
            
            this.width = width;
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.x1 = x1;
            this.y1 = y1;
            this.width = width;
            this.height1 = height1;

            js.append(String.format(Locale.US, jsBase + ".bounds(%s, %s, %f, %s);", x1, y1, width, height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s, %s, %f, %s);", x1, y1, width, height1));
                js.setLength(0);
            }
        }
    }


    public void setBounds(String x1, String y1, String width1, Double height) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x1 = x1;
            this.y = null;
            this.y1 = null;
            
            this.y1 = y1;
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
            this.height = null;
            this.height1 = null;
            
            this.height = height;
        } else {
            this.x1 = x1;
            this.y1 = y1;
            this.width1 = width1;
            this.height = height;

            js.append(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %f);", x1, y1, width1, height));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %f);", x1, y1, width1, height));
                js.setLength(0);
            }
        }
    }


    public void setBounds(String x1, String y1, String width1, String height1) {
        if (jsBase == null) {
            this.x = null;
            this.x1 = null;
            
            this.x1 = x1;
            this.y = null;
            this.y1 = null;
            
            this.y1 = y1;
            this.width = null;
            this.width1 = null;
            
            this.width1 = width1;
            this.height = null;
            this.height1 = null;
            
            this.height1 = height1;
        } else {
            this.x1 = x1;
            this.y1 = y1;
            this.width1 = width1;
            this.height1 = height1;

            js.append(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x1, y1, width1, height1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".bounds(%s, %s, %s, %s);", x1, y1, width1, height1));
                js.setLength(0);
            }
        }
    }

    private String color;

    public void setColor(String color) {
        if (jsBase == null) {
            this.color = color;
        } else {
            this.color = color;

            js.append(String.format(Locale.US, jsBase + ".color(%s);", color));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".color(%s);", color));
                js.setLength(0);
            }
        }
    }

    private View getData;

    public View getData() {
        if (getData == null)
            getData = new View(jsBase + ".data()");

        return getData;
    }

    private View data;
    private Set data1;
    private String[] data2;
    private String data3;
    private TextParsingMode csvSettings;
    private TextParsingSettings csvSettings1;

    public void setData(View data, TextParsingMode csvSettings) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data = data;
            this.csvSettings = null;
            this.csvSettings1 = null;
            
            this.csvSettings = csvSettings;
        } else {
            this.data = data;
            this.csvSettings = csvSettings;

            js.append(String.format(Locale.US, jsBase + ".data(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setData(View data, TextParsingSettings csvSettings1) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data = data;
            this.csvSettings = null;
            this.csvSettings1 = null;
            
            this.csvSettings1 = csvSettings1;
        } else {
            this.data = data;
            this.csvSettings1 = csvSettings1;

            js.append(String.format(Locale.US, jsBase + ".data(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s);", (data != null) ? data.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setData(Set data1, TextParsingMode csvSettings) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data1 = data1;
            this.csvSettings = null;
            this.csvSettings1 = null;
            
            this.csvSettings = csvSettings;
        } else {
            this.data1 = data1;
            this.csvSettings = csvSettings;

            js.append(String.format(Locale.US, jsBase + ".data(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings != null) ? csvSettings.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setData(Set data1, TextParsingSettings csvSettings1) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data1 = data1;
            this.csvSettings = null;
            this.csvSettings1 = null;
            
            this.csvSettings1 = csvSettings1;
        } else {
            this.data1 = data1;
            this.csvSettings1 = csvSettings1;

            js.append(String.format(Locale.US, jsBase + ".data(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s);", (data1 != null) ? data1.generateJs() : "null", (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setData(String[] data2, TextParsingMode csvSettings) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data2 = data2;
            this.csvSettings = null;
            this.csvSettings1 = null;
            
            this.csvSettings = csvSettings;
        } else {
            this.data2 = data2;
            this.csvSettings = csvSettings;

            js.append(String.format(Locale.US, jsBase + ".data(%s, %s);", Arrays.toString(data2), (csvSettings != null) ? csvSettings.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s);", Arrays.toString(data2), (csvSettings != null) ? csvSettings.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setData(String[] data2, TextParsingSettings csvSettings1) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data2 = data2;
            this.csvSettings = null;
            this.csvSettings1 = null;
            
            this.csvSettings1 = csvSettings1;
        } else {
            this.data2 = data2;
            this.csvSettings1 = csvSettings1;

            js.append(String.format(Locale.US, jsBase + ".data(%s, %s);", Arrays.toString(data2), (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s);", Arrays.toString(data2), (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setData(String data3, TextParsingMode csvSettings) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data3 = data3;
            this.csvSettings = null;
            this.csvSettings1 = null;
            
            this.csvSettings = csvSettings;
        } else {
            this.data3 = data3;
            this.csvSettings = csvSettings;

            js.append(String.format(Locale.US, jsBase + ".data(%s, %s);", data3, (csvSettings != null) ? csvSettings.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s);", data3, (csvSettings != null) ? csvSettings.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setData(String data3, TextParsingSettings csvSettings1) {
        if (jsBase == null) {
            this.data = null;
            this.data1 = null;
            this.data2 = null;
            this.data3 = null;
            
            this.data3 = data3;
            this.csvSettings = null;
            this.csvSettings1 = null;
            
            this.csvSettings1 = csvSettings1;
        } else {
            this.data3 = data3;
            this.csvSettings1 = csvSettings1;

            js.append(String.format(Locale.US, jsBase + ".data(%s, %s);", data3, (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".data(%s, %s);", data3, (csvSettings1 != null) ? csvSettings1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Boolean displayNegative;

    public void setDisplaynegative(Boolean displayNegative) {
        if (jsBase == null) {
            this.displayNegative = displayNegative;
        } else {
            this.displayNegative = displayNegative;

            js.append(String.format(Locale.US, jsBase + ".displayNegative(%b);", displayNegative));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".displayNegative(%b);", displayNegative));
                js.setLength(0);
            }
        }
    }

    private Boolean enabled;

    public void setEnabled(Boolean enabled) {
        if (jsBase == null) {
            this.enabled = enabled;
        } else {
            this.enabled = enabled;

            js.append(String.format(Locale.US, jsBase + ".enabled(%b);", enabled));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".enabled(%b);", enabled));
                js.setLength(0);
            }
        }
    }

    private Double indexes;
    private Double[] indexes1;

    public void setExcludepoint(Double indexes) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            
            this.indexes = indexes;
        } else {
            this.indexes = indexes;

            js.append(String.format(Locale.US, jsBase + ".excludePoint(%f);", indexes));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".excludePoint(%f);", indexes));
                js.setLength(0);
            }
        }
    }


    public void setExcludepoint(Double[] indexes1) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            
            this.indexes1 = indexes1;
        } else {
            this.indexes1 = indexes1;

            js.append(String.format(Locale.US, jsBase + ".excludePoint(%s);", Arrays.toString(indexes1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".excludePoint(%s);", Arrays.toString(indexes1)));
                js.setLength(0);
            }
        }
    }

    private Fill fill;

    public void setFill(Fill fill) {
        if (jsBase == null) {
            this.fill = fill;
        } else {
            this.fill = fill;

            js.append(String.format(Locale.US, jsBase + ".fill(%s);", (fill != null) ? fill.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s);", (fill != null) ? fill.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String color1;
    private Double opacity;

    public void setFill(String color1, Double opacity) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            
            this.color1 = color1;
            this.opacity = opacity;
        } else {
            this.color1 = color1;
            this.opacity = opacity;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f);", color1, opacity));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f);", color1, opacity));
                js.setLength(0);
            }
        }
    }

    private GradientKey[] keys;
    private String[] keys1;
    private Double angle;
    private Boolean mode;
    private VectorRect mode1;
    private String mode2;
    private Double opacity1;

    public void setFill(GradientKey[] keys, Boolean mode, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode = mode;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys = keys;
            this.mode = mode;
            this.angle = angle;
            this.opacity1 = opacity1;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f);", arrayToString(keys), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f);", arrayToString(keys), mode, angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] keys, VectorRect mode1, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys = keys;
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity1 = opacity1;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", arrayToString(keys), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setFill(GradientKey[] keys, String mode2, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys = keys;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys = keys;
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity1 = opacity1;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", arrayToString(keys), mode2, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", arrayToString(keys), mode2, angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] keys1, Boolean mode, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode = mode;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys1 = keys1;
            this.mode = mode;
            this.angle = angle;
            this.opacity1 = opacity1;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f);", Arrays.toString(keys1), mode, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %b, %f, %f);", Arrays.toString(keys1), mode, angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] keys1, VectorRect mode1, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys1 = keys1;
            this.mode1 = mode1;
            this.angle = angle;
            this.opacity1 = opacity1;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", Arrays.toString(keys1), (mode1 != null) ? mode1.generateJs() : "null", angle, opacity1));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] keys1, String mode2, Double angle, Double opacity1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            
            this.keys1 = keys1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity = null;
            this.opacity1 = null;
            
            this.opacity1 = opacity1;
        } else {
            this.keys1 = keys1;
            this.mode2 = mode2;
            this.angle = angle;
            this.opacity1 = opacity1;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", Arrays.toString(keys1), mode2, angle, opacity1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %s, %f, %f);", Arrays.toString(keys1), mode2, angle, opacity1));
                js.setLength(0);
            }
        }
    }

    private GradientKey[] keys2;
    private String[] keys3;
    private Double cx;
    private Double cy;
    private GraphicsMathRect mode3;
    private Double opacity2;
    private Double fx;
    private Double fy;

    public void setFill(GradientKey[] keys2, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            
            this.keys2 = keys2;
            this.cx = cx;
            this.cy = cy;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            
            this.mode3 = mode3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.keys2 = keys2;
            this.cx = cx;
            this.cy = cy;
            this.mode3 = mode3;
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys2), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
                js.setLength(0);
            }
        }
    }


    public void setFill(String[] keys3, Double cx, Double cy, GraphicsMathRect mode3, Double opacity2, Double fx, Double fy) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            
            this.keys3 = keys3;
            this.cx = cx;
            this.cy = cy;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            
            this.mode3 = mode3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;
        } else {
            this.keys3 = keys3;
            this.cx = cx;
            this.cy = cy;
            this.mode3 = mode3;
            this.opacity2 = opacity2;
            this.fx = fx;
            this.fy = fy;

            js.append(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".fill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys3), cx, cy, (mode3 != null) ? mode3.generateJs() : "null", opacity2, fx, fy));
                js.setLength(0);
            }
        }
    }

    private Fill imageSettings;
    private String geoIdField;

    public void setGeoidfield(String geoIdField) {
        if (jsBase == null) {
            this.geoIdField = geoIdField;
        } else {
            this.geoIdField = geoIdField;

            js.append(String.format(Locale.US, jsBase + ".geoIdField(%s);", geoIdField));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".geoIdField(%s);", geoIdField));
                js.setLength(0);
            }
        }
    }

    private Double index;

    public void setGetpoint(Double index) {
        if (jsBase == null) {
            this.index = index;
        } else {
            this.index = index;

            js.append(String.format(Locale.US, jsBase + ".getPoint(%f);", index));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getPoint(%f);", index));
                js.setLength(0);
            }
        }
    }

    private String key;
    private Statistics key1;

    public void setGetstat(String key) {
        if (jsBase == null) {
            this.key = null;
            this.key1 = null;
            
            this.key = key;
        } else {
            this.key = key;

            js.append(String.format(Locale.US, jsBase + ".getStat(%s);", key));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getStat(%s);", key));
                js.setLength(0);
            }
        }
    }


    public void setGetstat(Statistics key1) {
        if (jsBase == null) {
            this.key = null;
            this.key1 = null;
            
            this.key1 = key1;
        } else {
            this.key1 = key1;

            js.append(String.format(Locale.US, jsBase + ".getStat(%s);", (key1 != null) ? key1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".getStat(%s);", (key1 != null) ? key1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private PatternFill getHatchFill;

    public PatternFill getHatchFill() {
        if (getHatchFill == null)
            getHatchFill = new PatternFill(jsBase + ".hatchFill()");

        return getHatchFill;
    }

    private PatternFill patternFillOrTypeOrState;
    private HatchFill patternFillOrTypeOrState1;
    private HatchFillType patternFillOrTypeOrState2;
    private String patternFillOrTypeOrState3;
    private Boolean patternFillOrTypeOrState4;
    private String color2;
    private Double thickness;
    private Double size;

    public void setHatchfill(PatternFill patternFillOrTypeOrState, String color2, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState = patternFillOrTypeOrState;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color2 = color2;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrTypeOrState = patternFillOrTypeOrState;
            this.color2 = color2;
            this.thickness = thickness;
            this.size = size;

            js.append(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState != null) ? patternFillOrTypeOrState.generateJs() : "null", color2, thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState != null) ? patternFillOrTypeOrState.generateJs() : "null", color2, thickness, size));
                js.setLength(0);
            }
        }
    }


    public void setHatchfill(HatchFill patternFillOrTypeOrState1, String color2, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState1 = patternFillOrTypeOrState1;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color2 = color2;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrTypeOrState1 = patternFillOrTypeOrState1;
            this.color2 = color2;
            this.thickness = thickness;
            this.size = size;

            js.append(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState1 != null) ? patternFillOrTypeOrState1.generateJs() : "null", color2, thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState1 != null) ? patternFillOrTypeOrState1.generateJs() : "null", color2, thickness, size));
                js.setLength(0);
            }
        }
    }


    public void setHatchfill(HatchFillType patternFillOrTypeOrState2, String color2, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState2 = patternFillOrTypeOrState2;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color2 = color2;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrTypeOrState2 = patternFillOrTypeOrState2;
            this.color2 = color2;
            this.thickness = thickness;
            this.size = size;

            js.append(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState2 != null) ? patternFillOrTypeOrState2.generateJs() : "null", color2, thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState2 != null) ? patternFillOrTypeOrState2.generateJs() : "null", color2, thickness, size));
                js.setLength(0);
            }
        }
    }


    public void setHatchfill(String patternFillOrTypeOrState3, String color2, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState3 = patternFillOrTypeOrState3;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color2 = color2;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrTypeOrState3 = patternFillOrTypeOrState3;
            this.color2 = color2;
            this.thickness = thickness;
            this.size = size;

            js.append(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %f, %f);", patternFillOrTypeOrState3, color2, thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFill(%s, %s, %f, %f);", patternFillOrTypeOrState3, color2, thickness, size));
                js.setLength(0);
            }
        }
    }


    public void setHatchfill(Boolean patternFillOrTypeOrState4, String color2, Double thickness, Double size) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            
            this.patternFillOrTypeOrState4 = patternFillOrTypeOrState4;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            
            this.color2 = color2;
            this.thickness = thickness;
            this.size = size;
        } else {
            this.patternFillOrTypeOrState4 = patternFillOrTypeOrState4;
            this.color2 = color2;
            this.thickness = thickness;
            this.size = size;

            js.append(String.format(Locale.US, jsBase + ".hatchFill(%b, %s, %f, %f);", patternFillOrTypeOrState4, color2, thickness, size));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hatchFill(%b, %s, %f, %f);", patternFillOrTypeOrState4, color2, thickness, size));
                js.setLength(0);
            }
        }
    }

    private Double height2;
    private String height3;

    public void setHeight(Double height2) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            
            this.height2 = height2;
        } else {
            this.height2 = height2;

            js.append(String.format(Locale.US, jsBase + ".height(%f);", height2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".height(%f);", height2));
                js.setLength(0);
            }
        }
    }


    public void setHeight(String height3) {
        if (jsBase == null) {
            this.height = null;
            this.height1 = null;
            this.height2 = null;
            this.height3 = null;
            
            this.height3 = height3;
        } else {
            this.height3 = height3;

            js.append(String.format(Locale.US, jsBase + ".height(%s);", height3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".height(%s);", height3));
                js.setLength(0);
            }
        }
    }

    private Double index1;

    public void setHover(Double index1) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            
            this.index1 = index1;
        } else {
            this.index1 = index1;

            js.append(String.format(Locale.US, jsBase + ".hover(%f);", index1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hover(%f);", index1));
                js.setLength(0);
            }
        }
    }

    private Double[] indexes2;

    public void setHover(Double[] indexes2) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            
            this.indexes2 = indexes2;
        } else {
            this.indexes2 = indexes2;

            js.append(String.format(Locale.US, jsBase + ".hover(%s);", Arrays.toString(indexes2)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hover(%s);", Arrays.toString(indexes2)));
                js.setLength(0);
            }
        }
    }

    private Fill hoverFill;

    public void setHoverfill(Fill hoverFill) {
        if (jsBase == null) {
            this.hoverFill = hoverFill;
        } else {
            this.hoverFill = hoverFill;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s);", (hoverFill != null) ? hoverFill.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s);", (hoverFill != null) ? hoverFill.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String color3;
    private Double opacity3;

    public void setHoverfill(String color3, Double opacity3) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            
            this.color3 = color3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            
            this.opacity3 = opacity3;
        } else {
            this.color3 = color3;
            this.opacity3 = opacity3;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %f);", color3, opacity3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %f);", color3, opacity3));
                js.setLength(0);
            }
        }
    }

    private GradientKey[] keys4;
    private String[] keys5;
    private Double angle1;
    private Boolean mode4;
    private VectorRect mode5;
    private String mode6;
    private Double opacity4;

    public void setHoverfill(GradientKey[] keys4, Boolean mode4, Double angle1, Double opacity4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys4 = keys4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode4 = mode4;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
        } else {
            this.keys4 = keys4;
            this.mode4 = mode4;
            this.angle1 = angle1;
            this.opacity4 = opacity4;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %b, %f, %f);", arrayToString(keys4), mode4, angle1, opacity4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %b, %f, %f);", arrayToString(keys4), mode4, angle1, opacity4));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(GradientKey[] keys4, VectorRect mode5, Double angle1, Double opacity4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys4 = keys4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode5 = mode5;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
        } else {
            this.keys4 = keys4;
            this.mode5 = mode5;
            this.angle1 = angle1;
            this.opacity4 = opacity4;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %f, %f);", arrayToString(keys4), (mode5 != null) ? mode5.generateJs() : "null", angle1, opacity4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %f, %f);", arrayToString(keys4), (mode5 != null) ? mode5.generateJs() : "null", angle1, opacity4));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(GradientKey[] keys4, String mode6, Double angle1, Double opacity4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys4 = keys4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode6 = mode6;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
        } else {
            this.keys4 = keys4;
            this.mode6 = mode6;
            this.angle1 = angle1;
            this.opacity4 = opacity4;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %f, %f);", arrayToString(keys4), mode6, angle1, opacity4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %f, %f);", arrayToString(keys4), mode6, angle1, opacity4));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(String[] keys5, Boolean mode4, Double angle1, Double opacity4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys5 = keys5;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode4 = mode4;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
        } else {
            this.keys5 = keys5;
            this.mode4 = mode4;
            this.angle1 = angle1;
            this.opacity4 = opacity4;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %b, %f, %f);", Arrays.toString(keys5), mode4, angle1, opacity4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %b, %f, %f);", Arrays.toString(keys5), mode4, angle1, opacity4));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(String[] keys5, VectorRect mode5, Double angle1, Double opacity4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys5 = keys5;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode5 = mode5;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
        } else {
            this.keys5 = keys5;
            this.mode5 = mode5;
            this.angle1 = angle1;
            this.opacity4 = opacity4;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %f, %f);", Arrays.toString(keys5), (mode5 != null) ? mode5.generateJs() : "null", angle1, opacity4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %f, %f);", Arrays.toString(keys5), (mode5 != null) ? mode5.generateJs() : "null", angle1, opacity4));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(String[] keys5, String mode6, Double angle1, Double opacity4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            
            this.keys5 = keys5;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            
            this.mode6 = mode6;
            this.angle = null;
            this.angle1 = null;
            
            this.angle1 = angle1;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            
            this.opacity4 = opacity4;
        } else {
            this.keys5 = keys5;
            this.mode6 = mode6;
            this.angle1 = angle1;
            this.opacity4 = opacity4;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %f, %f);", Arrays.toString(keys5), mode6, angle1, opacity4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %s, %f, %f);", Arrays.toString(keys5), mode6, angle1, opacity4));
                js.setLength(0);
            }
        }
    }

    private GradientKey[] keys6;
    private String[] keys7;
    private Double cx1;
    private Double cy1;
    private GraphicsMathRect mode7;
    private Double opacity5;
    private Double fx1;
    private Double fy1;

    public void setHoverfill(GradientKey[] keys6, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            
            this.keys6 = keys6;
            this.cx = null;
            this.cx1 = null;
            
            this.cx1 = cx1;
            this.cy = null;
            this.cy1 = null;
            
            this.cy1 = cy1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            
            this.mode7 = mode7;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            
            this.opacity5 = opacity5;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.keys6 = keys6;
            this.cx1 = cx1;
            this.cy1 = cy1;
            this.mode7 = mode7;
            this.opacity5 = opacity5;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys6), cx1, cy1, (mode7 != null) ? mode7.generateJs() : "null", opacity5, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys6), cx1, cy1, (mode7 != null) ? mode7.generateJs() : "null", opacity5, fx1, fy1));
                js.setLength(0);
            }
        }
    }


    public void setHoverfill(String[] keys7, Double cx1, Double cy1, GraphicsMathRect mode7, Double opacity5, Double fx1, Double fy1) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            
            this.keys7 = keys7;
            this.cx = null;
            this.cx1 = null;
            
            this.cx1 = cx1;
            this.cy = null;
            this.cy1 = null;
            
            this.cy1 = cy1;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            
            this.mode7 = mode7;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            
            this.opacity5 = opacity5;
            this.fx = null;
            this.fx1 = null;
            
            this.fx1 = fx1;
            this.fy = null;
            this.fy1 = null;
            
            this.fy1 = fy1;
        } else {
            this.keys7 = keys7;
            this.cx1 = cx1;
            this.cy1 = cy1;
            this.mode7 = mode7;
            this.opacity5 = opacity5;
            this.fx1 = fx1;
            this.fy1 = fy1;

            js.append(String.format(Locale.US, jsBase + ".hoverFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys7), cx1, cy1, (mode7 != null) ? mode7.generateJs() : "null", opacity5, fx1, fy1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys7), cx1, cy1, (mode7 != null) ? mode7.generateJs() : "null", opacity5, fx1, fy1));
                js.setLength(0);
            }
        }
    }

    private Fill imageSettings1;
    private PatternFill getHoverHatchFill;

    public PatternFill getHoverHatchFill() {
        if (getHoverHatchFill == null)
            getHoverHatchFill = new PatternFill(jsBase + ".hoverHatchFill()");

        return getHoverHatchFill;
    }

    private PatternFill patternFillOrTypeOrState5;
    private HatchFill patternFillOrTypeOrState6;
    private HatchFillType patternFillOrTypeOrState7;
    private String patternFillOrTypeOrState8;
    private Boolean patternFillOrTypeOrState9;
    private String color4;
    private Double thickness1;
    private Double size1;

    public void setHoverhatchfill(PatternFill patternFillOrTypeOrState5, String color4, Double thickness1, Double size1) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            
            this.patternFillOrTypeOrState5 = patternFillOrTypeOrState5;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            
            this.color4 = color4;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrTypeOrState5 = patternFillOrTypeOrState5;
            this.color4 = color4;
            this.thickness1 = thickness1;
            this.size1 = size1;

            js.append(String.format(Locale.US, jsBase + ".hoverHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState5 != null) ? patternFillOrTypeOrState5.generateJs() : "null", color4, thickness1, size1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState5 != null) ? patternFillOrTypeOrState5.generateJs() : "null", color4, thickness1, size1));
                js.setLength(0);
            }
        }
    }


    public void setHoverhatchfill(HatchFill patternFillOrTypeOrState6, String color4, Double thickness1, Double size1) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            
            this.patternFillOrTypeOrState6 = patternFillOrTypeOrState6;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            
            this.color4 = color4;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrTypeOrState6 = patternFillOrTypeOrState6;
            this.color4 = color4;
            this.thickness1 = thickness1;
            this.size1 = size1;

            js.append(String.format(Locale.US, jsBase + ".hoverHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState6 != null) ? patternFillOrTypeOrState6.generateJs() : "null", color4, thickness1, size1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState6 != null) ? patternFillOrTypeOrState6.generateJs() : "null", color4, thickness1, size1));
                js.setLength(0);
            }
        }
    }


    public void setHoverhatchfill(HatchFillType patternFillOrTypeOrState7, String color4, Double thickness1, Double size1) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            
            this.patternFillOrTypeOrState7 = patternFillOrTypeOrState7;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            
            this.color4 = color4;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrTypeOrState7 = patternFillOrTypeOrState7;
            this.color4 = color4;
            this.thickness1 = thickness1;
            this.size1 = size1;

            js.append(String.format(Locale.US, jsBase + ".hoverHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState7 != null) ? patternFillOrTypeOrState7.generateJs() : "null", color4, thickness1, size1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState7 != null) ? patternFillOrTypeOrState7.generateJs() : "null", color4, thickness1, size1));
                js.setLength(0);
            }
        }
    }


    public void setHoverhatchfill(String patternFillOrTypeOrState8, String color4, Double thickness1, Double size1) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            
            this.patternFillOrTypeOrState8 = patternFillOrTypeOrState8;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            
            this.color4 = color4;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrTypeOrState8 = patternFillOrTypeOrState8;
            this.color4 = color4;
            this.thickness1 = thickness1;
            this.size1 = size1;

            js.append(String.format(Locale.US, jsBase + ".hoverHatchFill(%s, %s, %f, %f);", patternFillOrTypeOrState8, color4, thickness1, size1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverHatchFill(%s, %s, %f, %f);", patternFillOrTypeOrState8, color4, thickness1, size1));
                js.setLength(0);
            }
        }
    }


    public void setHoverhatchfill(Boolean patternFillOrTypeOrState9, String color4, Double thickness1, Double size1) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            
            this.patternFillOrTypeOrState9 = patternFillOrTypeOrState9;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            
            this.color4 = color4;
            this.thickness = null;
            this.thickness1 = null;
            
            this.thickness1 = thickness1;
            this.size = null;
            this.size1 = null;
            
            this.size1 = size1;
        } else {
            this.patternFillOrTypeOrState9 = patternFillOrTypeOrState9;
            this.color4 = color4;
            this.thickness1 = thickness1;
            this.size1 = size1;

            js.append(String.format(Locale.US, jsBase + ".hoverHatchFill(%b, %s, %f, %f);", patternFillOrTypeOrState9, color4, thickness1, size1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverHatchFill(%b, %s, %f, %f);", patternFillOrTypeOrState9, color4, thickness1, size1));
                js.setLength(0);
            }
        }
    }

    private UiLabelsFactory getHoverLabels;

    public UiLabelsFactory getHoverLabels() {
        if (getHoverLabels == null)
            getHoverLabels = new UiLabelsFactory(jsBase + ".hoverLabels()");

        return getHoverLabels;
    }

    private String hoverLabels;
    private Boolean hoverLabels1;

    public void setHoverlabels(String hoverLabels) {
        if (jsBase == null) {
            this.hoverLabels = null;
            this.hoverLabels1 = null;
            
            this.hoverLabels = hoverLabels;
        } else {
            this.hoverLabels = hoverLabels;

            js.append(String.format(Locale.US, jsBase + ".hoverLabels(%s);", hoverLabels));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverLabels(%s);", hoverLabels));
                js.setLength(0);
            }
        }
    }


    public void setHoverlabels(Boolean hoverLabels1) {
        if (jsBase == null) {
            this.hoverLabels = null;
            this.hoverLabels1 = null;
            
            this.hoverLabels1 = hoverLabels1;
        } else {
            this.hoverLabels1 = hoverLabels1;

            js.append(String.format(Locale.US, jsBase + ".hoverLabels(%b);", hoverLabels1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverLabels(%b);", hoverLabels1));
                js.setLength(0);
            }
        }
    }

    private UiMarkersFactory getHoverMarkers;

    public UiMarkersFactory getHoverMarkers() {
        if (getHoverMarkers == null)
            getHoverMarkers = new UiMarkersFactory(jsBase + ".hoverMarkers()");

        return getHoverMarkers;
    }

    private String hoverMarkers;
    private Boolean hoverMarkers1;
    private String hoverMarkers2;

    public void setHovermarkers(String hoverMarkers) {
        if (jsBase == null) {
            this.hoverMarkers = null;
            this.hoverMarkers1 = null;
            this.hoverMarkers2 = null;
            
            this.hoverMarkers = hoverMarkers;
        } else {
            this.hoverMarkers = hoverMarkers;

            js.append(String.format(Locale.US, jsBase + ".hoverMarkers(%s);", hoverMarkers));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverMarkers(%s);", hoverMarkers));
                js.setLength(0);
            }
        }
    }


    public void setHovermarkers(Boolean hoverMarkers1) {
        if (jsBase == null) {
            this.hoverMarkers = null;
            this.hoverMarkers1 = null;
            this.hoverMarkers2 = null;
            
            this.hoverMarkers1 = hoverMarkers1;
        } else {
            this.hoverMarkers1 = hoverMarkers1;

            js.append(String.format(Locale.US, jsBase + ".hoverMarkers(%b);", hoverMarkers1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverMarkers(%b);", hoverMarkers1));
                js.setLength(0);
            }
        }
    }

    private Fill hoverNegativeFill;

    public void setHovernegativefill(Fill hoverNegativeFill) {
        if (jsBase == null) {
            this.hoverNegativeFill = hoverNegativeFill;
        } else {
            this.hoverNegativeFill = hoverNegativeFill;

            js.append(String.format(Locale.US, jsBase + ".hoverNegativeFill(%s);", (hoverNegativeFill != null) ? hoverNegativeFill.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverNegativeFill(%s);", (hoverNegativeFill != null) ? hoverNegativeFill.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String color5;
    private Double opacity6;

    public void setHovernegativefill(String color5, Double opacity6) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            
            this.color5 = color5;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            
            this.opacity6 = opacity6;
        } else {
            this.color5 = color5;
            this.opacity6 = opacity6;

            js.append(String.format(Locale.US, jsBase + ".hoverNegativeFill(%s, %f);", color5, opacity6));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverNegativeFill(%s, %f);", color5, opacity6));
                js.setLength(0);
            }
        }
    }

    private GradientKey[] keys8;
    private String[] keys9;
    private Double angle2;
    private Boolean mode8;
    private VectorRect mode9;
    private String mode10;
    private Double opacity7;

    public void setHovernegativefill(GradientKey[] keys8, Boolean mode8, Double angle2, Double opacity7) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            
            this.keys8 = keys8;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            
            this.mode8 = mode8;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            
            this.angle2 = angle2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            
            this.opacity7 = opacity7;
        } else {
            this.keys8 = keys8;
            this.mode8 = mode8;
            this.angle2 = angle2;
            this.opacity7 = opacity7;

            js.append(String.format(Locale.US, jsBase + ".hoverNegativeFill(%s, %b, %f, %f);", arrayToString(keys8), mode8, angle2, opacity7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverNegativeFill(%s, %b, %f, %f);", arrayToString(keys8), mode8, angle2, opacity7));
                js.setLength(0);
            }
        }
    }


    public void setHovernegativefill(GradientKey[] keys8, VectorRect mode9, Double angle2, Double opacity7) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            
            this.keys8 = keys8;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            
            this.mode9 = mode9;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            
            this.angle2 = angle2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            
            this.opacity7 = opacity7;
        } else {
            this.keys8 = keys8;
            this.mode9 = mode9;
            this.angle2 = angle2;
            this.opacity7 = opacity7;

            js.append(String.format(Locale.US, jsBase + ".hoverNegativeFill(%s, %s, %f, %f);", arrayToString(keys8), (mode9 != null) ? mode9.generateJs() : "null", angle2, opacity7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverNegativeFill(%s, %s, %f, %f);", arrayToString(keys8), (mode9 != null) ? mode9.generateJs() : "null", angle2, opacity7));
                js.setLength(0);
            }
        }
    }


    public void setHovernegativefill(GradientKey[] keys8, String mode10, Double angle2, Double opacity7) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            
            this.keys8 = keys8;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            
            this.mode10 = mode10;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            
            this.angle2 = angle2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            
            this.opacity7 = opacity7;
        } else {
            this.keys8 = keys8;
            this.mode10 = mode10;
            this.angle2 = angle2;
            this.opacity7 = opacity7;

            js.append(String.format(Locale.US, jsBase + ".hoverNegativeFill(%s, %s, %f, %f);", arrayToString(keys8), mode10, angle2, opacity7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverNegativeFill(%s, %s, %f, %f);", arrayToString(keys8), mode10, angle2, opacity7));
                js.setLength(0);
            }
        }
    }


    public void setHovernegativefill(String[] keys9, Boolean mode8, Double angle2, Double opacity7) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            
            this.keys9 = keys9;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            
            this.mode8 = mode8;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            
            this.angle2 = angle2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            
            this.opacity7 = opacity7;
        } else {
            this.keys9 = keys9;
            this.mode8 = mode8;
            this.angle2 = angle2;
            this.opacity7 = opacity7;

            js.append(String.format(Locale.US, jsBase + ".hoverNegativeFill(%s, %b, %f, %f);", Arrays.toString(keys9), mode8, angle2, opacity7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverNegativeFill(%s, %b, %f, %f);", Arrays.toString(keys9), mode8, angle2, opacity7));
                js.setLength(0);
            }
        }
    }


    public void setHovernegativefill(String[] keys9, VectorRect mode9, Double angle2, Double opacity7) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            
            this.keys9 = keys9;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            
            this.mode9 = mode9;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            
            this.angle2 = angle2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            
            this.opacity7 = opacity7;
        } else {
            this.keys9 = keys9;
            this.mode9 = mode9;
            this.angle2 = angle2;
            this.opacity7 = opacity7;

            js.append(String.format(Locale.US, jsBase + ".hoverNegativeFill(%s, %s, %f, %f);", Arrays.toString(keys9), (mode9 != null) ? mode9.generateJs() : "null", angle2, opacity7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverNegativeFill(%s, %s, %f, %f);", Arrays.toString(keys9), (mode9 != null) ? mode9.generateJs() : "null", angle2, opacity7));
                js.setLength(0);
            }
        }
    }


    public void setHovernegativefill(String[] keys9, String mode10, Double angle2, Double opacity7) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            
            this.keys9 = keys9;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            
            this.mode10 = mode10;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            
            this.angle2 = angle2;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            
            this.opacity7 = opacity7;
        } else {
            this.keys9 = keys9;
            this.mode10 = mode10;
            this.angle2 = angle2;
            this.opacity7 = opacity7;

            js.append(String.format(Locale.US, jsBase + ".hoverNegativeFill(%s, %s, %f, %f);", Arrays.toString(keys9), mode10, angle2, opacity7));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverNegativeFill(%s, %s, %f, %f);", Arrays.toString(keys9), mode10, angle2, opacity7));
                js.setLength(0);
            }
        }
    }

    private GradientKey[] keys10;
    private String[] keys11;
    private Double cx2;
    private Double cy2;
    private GraphicsMathRect mode11;
    private Double opacity8;
    private Double fx2;
    private Double fy2;

    public void setHovernegativefill(GradientKey[] keys10, Double cx2, Double cy2, GraphicsMathRect mode11, Double opacity8, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            
            this.keys10 = keys10;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            
            this.cx2 = cx2;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            
            this.cy2 = cy2;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            
            this.mode11 = mode11;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            
            this.opacity8 = opacity8;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.keys10 = keys10;
            this.cx2 = cx2;
            this.cy2 = cy2;
            this.mode11 = mode11;
            this.opacity8 = opacity8;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverNegativeFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys10), cx2, cy2, (mode11 != null) ? mode11.generateJs() : "null", opacity8, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverNegativeFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys10), cx2, cy2, (mode11 != null) ? mode11.generateJs() : "null", opacity8, fx2, fy2));
                js.setLength(0);
            }
        }
    }


    public void setHovernegativefill(String[] keys11, Double cx2, Double cy2, GraphicsMathRect mode11, Double opacity8, Double fx2, Double fy2) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            
            this.keys11 = keys11;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            
            this.cx2 = cx2;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            
            this.cy2 = cy2;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            
            this.mode11 = mode11;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            
            this.opacity8 = opacity8;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            
            this.fx2 = fx2;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            
            this.fy2 = fy2;
        } else {
            this.keys11 = keys11;
            this.cx2 = cx2;
            this.cy2 = cy2;
            this.mode11 = mode11;
            this.opacity8 = opacity8;
            this.fx2 = fx2;
            this.fy2 = fy2;

            js.append(String.format(Locale.US, jsBase + ".hoverNegativeFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys11), cx2, cy2, (mode11 != null) ? mode11.generateJs() : "null", opacity8, fx2, fy2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverNegativeFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys11), cx2, cy2, (mode11 != null) ? mode11.generateJs() : "null", opacity8, fx2, fy2));
                js.setLength(0);
            }
        }
    }

    private Fill imageSettings2;
    private PatternFill getHoverNegativeHatchFill;

    public PatternFill getHoverNegativeHatchFill() {
        if (getHoverNegativeHatchFill == null)
            getHoverNegativeHatchFill = new PatternFill(jsBase + ".hoverNegativeHatchFill()");

        return getHoverNegativeHatchFill;
    }

    private PatternFill patternFillOrTypeOrState10;
    private HatchFill patternFillOrTypeOrState11;
    private HatchFillType patternFillOrTypeOrState12;
    private String patternFillOrTypeOrState13;
    private Boolean patternFillOrTypeOrState14;
    private String color6;
    private Double thickness2;
    private Double size2;

    public void setHovernegativehatchfill(PatternFill patternFillOrTypeOrState10, String color6, Double thickness2, Double size2) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            this.patternFillOrTypeOrState10 = null;
            this.patternFillOrTypeOrState11 = null;
            this.patternFillOrTypeOrState12 = null;
            this.patternFillOrTypeOrState13 = null;
            this.patternFillOrTypeOrState14 = null;
            
            this.patternFillOrTypeOrState10 = patternFillOrTypeOrState10;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            
            this.color6 = color6;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            
            this.size2 = size2;
        } else {
            this.patternFillOrTypeOrState10 = patternFillOrTypeOrState10;
            this.color6 = color6;
            this.thickness2 = thickness2;
            this.size2 = size2;

            js.append(String.format(Locale.US, jsBase + ".hoverNegativeHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState10 != null) ? patternFillOrTypeOrState10.generateJs() : "null", color6, thickness2, size2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverNegativeHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState10 != null) ? patternFillOrTypeOrState10.generateJs() : "null", color6, thickness2, size2));
                js.setLength(0);
            }
        }
    }


    public void setHovernegativehatchfill(HatchFill patternFillOrTypeOrState11, String color6, Double thickness2, Double size2) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            this.patternFillOrTypeOrState10 = null;
            this.patternFillOrTypeOrState11 = null;
            this.patternFillOrTypeOrState12 = null;
            this.patternFillOrTypeOrState13 = null;
            this.patternFillOrTypeOrState14 = null;
            
            this.patternFillOrTypeOrState11 = patternFillOrTypeOrState11;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            
            this.color6 = color6;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            
            this.size2 = size2;
        } else {
            this.patternFillOrTypeOrState11 = patternFillOrTypeOrState11;
            this.color6 = color6;
            this.thickness2 = thickness2;
            this.size2 = size2;

            js.append(String.format(Locale.US, jsBase + ".hoverNegativeHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState11 != null) ? patternFillOrTypeOrState11.generateJs() : "null", color6, thickness2, size2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverNegativeHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState11 != null) ? patternFillOrTypeOrState11.generateJs() : "null", color6, thickness2, size2));
                js.setLength(0);
            }
        }
    }


    public void setHovernegativehatchfill(HatchFillType patternFillOrTypeOrState12, String color6, Double thickness2, Double size2) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            this.patternFillOrTypeOrState10 = null;
            this.patternFillOrTypeOrState11 = null;
            this.patternFillOrTypeOrState12 = null;
            this.patternFillOrTypeOrState13 = null;
            this.patternFillOrTypeOrState14 = null;
            
            this.patternFillOrTypeOrState12 = patternFillOrTypeOrState12;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            
            this.color6 = color6;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            
            this.size2 = size2;
        } else {
            this.patternFillOrTypeOrState12 = patternFillOrTypeOrState12;
            this.color6 = color6;
            this.thickness2 = thickness2;
            this.size2 = size2;

            js.append(String.format(Locale.US, jsBase + ".hoverNegativeHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState12 != null) ? patternFillOrTypeOrState12.generateJs() : "null", color6, thickness2, size2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverNegativeHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState12 != null) ? patternFillOrTypeOrState12.generateJs() : "null", color6, thickness2, size2));
                js.setLength(0);
            }
        }
    }


    public void setHovernegativehatchfill(String patternFillOrTypeOrState13, String color6, Double thickness2, Double size2) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            this.patternFillOrTypeOrState10 = null;
            this.patternFillOrTypeOrState11 = null;
            this.patternFillOrTypeOrState12 = null;
            this.patternFillOrTypeOrState13 = null;
            this.patternFillOrTypeOrState14 = null;
            
            this.patternFillOrTypeOrState13 = patternFillOrTypeOrState13;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            
            this.color6 = color6;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            
            this.size2 = size2;
        } else {
            this.patternFillOrTypeOrState13 = patternFillOrTypeOrState13;
            this.color6 = color6;
            this.thickness2 = thickness2;
            this.size2 = size2;

            js.append(String.format(Locale.US, jsBase + ".hoverNegativeHatchFill(%s, %s, %f, %f);", patternFillOrTypeOrState13, color6, thickness2, size2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverNegativeHatchFill(%s, %s, %f, %f);", patternFillOrTypeOrState13, color6, thickness2, size2));
                js.setLength(0);
            }
        }
    }


    public void setHovernegativehatchfill(Boolean patternFillOrTypeOrState14, String color6, Double thickness2, Double size2) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            this.patternFillOrTypeOrState10 = null;
            this.patternFillOrTypeOrState11 = null;
            this.patternFillOrTypeOrState12 = null;
            this.patternFillOrTypeOrState13 = null;
            this.patternFillOrTypeOrState14 = null;
            
            this.patternFillOrTypeOrState14 = patternFillOrTypeOrState14;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            
            this.color6 = color6;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            
            this.thickness2 = thickness2;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            
            this.size2 = size2;
        } else {
            this.patternFillOrTypeOrState14 = patternFillOrTypeOrState14;
            this.color6 = color6;
            this.thickness2 = thickness2;
            this.size2 = size2;

            js.append(String.format(Locale.US, jsBase + ".hoverNegativeHatchFill(%b, %s, %f, %f);", patternFillOrTypeOrState14, color6, thickness2, size2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverNegativeHatchFill(%b, %s, %f, %f);", patternFillOrTypeOrState14, color6, thickness2, size2));
                js.setLength(0);
            }
        }
    }

    private MapSeriesBubble getHoverNegativeStroke;

    public MapSeriesBubble getHoverNegativeStroke() {
        if (getHoverNegativeStroke == null)
            getHoverNegativeStroke = new MapSeriesBubble(jsBase + ".hoverNegativeStroke()");

        return getHoverNegativeStroke;
    }

    private Stroke color7;
    private ColoredFill color8;
    private String color9;
    private Double thickness3;
    private String dashpattern;
    private StrokeLineJoin lineJoin;
    private StrokeLineCap lineCap;

    public void setHovernegativestroke(Stroke color7, Double thickness3, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            
            this.color7 = color7;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            
            this.thickness3 = thickness3;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color7 = color7;
            this.thickness3 = thickness3;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;

            js.append(String.format(Locale.US, jsBase + ".hoverNegativeStroke(%s, %f, %s, %s, %s);", (color7 != null) ? color7.generateJs() : "null", thickness3, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverNegativeStroke(%s, %f, %s, %s, %s);", (color7 != null) ? color7.generateJs() : "null", thickness3, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setHovernegativestroke(ColoredFill color8, Double thickness3, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            
            this.color8 = color8;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            
            this.thickness3 = thickness3;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color8 = color8;
            this.thickness3 = thickness3;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;

            js.append(String.format(Locale.US, jsBase + ".hoverNegativeStroke(%s, %f, %s, %s, %s);", (color8 != null) ? color8.generateJs() : "null", thickness3, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverNegativeStroke(%s, %f, %s, %s, %s);", (color8 != null) ? color8.generateJs() : "null", thickness3, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setHovernegativestroke(String color9, Double thickness3, String dashpattern, StrokeLineJoin lineJoin, StrokeLineCap lineCap) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            
            this.color9 = color9;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            
            this.thickness3 = thickness3;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;
        } else {
            this.color9 = color9;
            this.thickness3 = thickness3;
            this.dashpattern = dashpattern;
            this.lineJoin = lineJoin;
            this.lineCap = lineCap;

            js.append(String.format(Locale.US, jsBase + ".hoverNegativeStroke(%s, %f, %s, %s, %s);", color9, thickness3, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverNegativeStroke(%s, %f, %s, %s, %s);", color9, thickness3, dashpattern, (lineJoin != null) ? lineJoin.generateJs() : "null", (lineCap != null) ? lineCap.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Stroke color10;
    private ColoredFill color11;
    private String color12;
    private Double thickness4;
    private String dashpattern1;
    private StrokeLineJoin lineJoin1;
    private StrokeLineCap lineCap1;

    public void setHoverstroke(Stroke color10, Double thickness4, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            
            this.color10 = color10;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            
            this.thickness4 = thickness4;
            this.dashpattern = null;
            this.dashpattern1 = null;
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.color10 = color10;
            this.thickness4 = thickness4;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;

            js.append(String.format(Locale.US, jsBase + ".hoverStroke(%s, %f, %s, %s, %s);", (color10 != null) ? color10.generateJs() : "null", thickness4, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverStroke(%s, %f, %s, %s, %s);", (color10 != null) ? color10.generateJs() : "null", thickness4, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setHoverstroke(ColoredFill color11, Double thickness4, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            
            this.color11 = color11;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            
            this.thickness4 = thickness4;
            this.dashpattern = null;
            this.dashpattern1 = null;
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.color11 = color11;
            this.thickness4 = thickness4;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;

            js.append(String.format(Locale.US, jsBase + ".hoverStroke(%s, %f, %s, %s, %s);", (color11 != null) ? color11.generateJs() : "null", thickness4, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverStroke(%s, %f, %s, %s, %s);", (color11 != null) ? color11.generateJs() : "null", thickness4, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setHoverstroke(String color12, Double thickness4, String dashpattern1, StrokeLineJoin lineJoin1, StrokeLineCap lineCap1) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            
            this.color12 = color12;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            
            this.thickness4 = thickness4;
            this.dashpattern = null;
            this.dashpattern1 = null;
            
            this.dashpattern1 = dashpattern1;
            this.lineJoin = null;
            this.lineJoin1 = null;
            
            this.lineJoin1 = lineJoin1;
            this.lineCap = null;
            this.lineCap1 = null;
            
            this.lineCap1 = lineCap1;
        } else {
            this.color12 = color12;
            this.thickness4 = thickness4;
            this.dashpattern1 = dashpattern1;
            this.lineJoin1 = lineJoin1;
            this.lineCap1 = lineCap1;

            js.append(String.format(Locale.US, jsBase + ".hoverStroke(%s, %f, %s, %s, %s);", color12, thickness4, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".hoverStroke(%s, %f, %s, %s, %s);", color12, thickness4, dashpattern1, (lineJoin1 != null) ? lineJoin1.generateJs() : "null", (lineCap1 != null) ? lineCap1.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String id;
    private Double id1;

    public void setId(String id) {
        if (jsBase == null) {
            this.id = null;
            this.id1 = null;
            
            this.id = id;
        } else {
            this.id = id;

            js.append(String.format(Locale.US, jsBase + ".id(%s);", id));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".id(%s);", id));
                js.setLength(0);
            }
        }
    }


    public void setId(Double id1) {
        if (jsBase == null) {
            this.id = null;
            this.id1 = null;
            
            this.id1 = id1;
        } else {
            this.id1 = id1;

            js.append(String.format(Locale.US, jsBase + ".id(%f);", id1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".id(%f);", id1));
                js.setLength(0);
            }
        }
    }

    private Double indexes3;
    private Double[] indexes4;

    public void setIncludepoint(Double indexes3) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            this.indexes3 = null;
            this.indexes4 = null;
            
            this.indexes3 = indexes3;
        } else {
            this.indexes3 = indexes3;

            js.append(String.format(Locale.US, jsBase + ".includePoint(%f);", indexes3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".includePoint(%f);", indexes3));
                js.setLength(0);
            }
        }
    }


    public void setIncludepoint(Double[] indexes4) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            this.indexes3 = null;
            this.indexes4 = null;
            
            this.indexes4 = indexes4;
        } else {
            this.indexes4 = indexes4;

            js.append(String.format(Locale.US, jsBase + ".includePoint(%s);", Arrays.toString(indexes4)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".includePoint(%s);", Arrays.toString(indexes4)));
                js.setLength(0);
            }
        }
    }

    private Double indexes5;
    private Double[] indexes6;

    public void setKeeponlypoints(Double indexes5) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            this.indexes3 = null;
            this.indexes4 = null;
            this.indexes5 = null;
            this.indexes6 = null;
            
            this.indexes5 = indexes5;
        } else {
            this.indexes5 = indexes5;

            js.append(String.format(Locale.US, jsBase + ".keepOnlyPoints(%f);", indexes5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".keepOnlyPoints(%f);", indexes5));
                js.setLength(0);
            }
        }
    }


    public void setKeeponlypoints(Double[] indexes6) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            this.indexes3 = null;
            this.indexes4 = null;
            this.indexes5 = null;
            this.indexes6 = null;
            
            this.indexes6 = indexes6;
        } else {
            this.indexes6 = indexes6;

            js.append(String.format(Locale.US, jsBase + ".keepOnlyPoints(%s);", Arrays.toString(indexes6)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".keepOnlyPoints(%s);", Arrays.toString(indexes6)));
                js.setLength(0);
            }
        }
    }

    private UiLabelsFactory getLabels;

    public UiLabelsFactory getLabels() {
        if (getLabels == null)
            getLabels = new UiLabelsFactory(jsBase + ".labels()");

        return getLabels;
    }

    private String labels;
    private Boolean labels1;

    public void setLabels(String labels) {
        if (jsBase == null) {
            this.labels = null;
            this.labels1 = null;
            
            this.labels = labels;
        } else {
            this.labels = labels;

            js.append(String.format(Locale.US, jsBase + ".labels(%s);", labels));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".labels(%s);", labels));
                js.setLength(0);
            }
        }
    }


    public void setLabels(Boolean labels1) {
        if (jsBase == null) {
            this.labels = null;
            this.labels1 = null;
            
            this.labels1 = labels1;
        } else {
            this.labels1 = labels1;

            js.append(String.format(Locale.US, jsBase + ".labels(%b);", labels1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".labels(%b);", labels1));
                js.setLength(0);
            }
        }
    }

    private Double left;
    private String left1;

    public void setLeft(Double left) {
        if (jsBase == null) {
            this.left = null;
            this.left1 = null;
            
            this.left = left;
        } else {
            this.left = left;

            js.append(String.format(Locale.US, jsBase + ".left(%f);", left));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".left(%f);", left));
                js.setLength(0);
            }
        }
    }


    public void setLeft(String left1) {
        if (jsBase == null) {
            this.left = null;
            this.left1 = null;
            
            this.left1 = left1;
        } else {
            this.left1 = left1;

            js.append(String.format(Locale.US, jsBase + ".left(%s);", left1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".left(%s);", left1));
                js.setLength(0);
            }
        }
    }

    private LegendItemSettings getLegendItem;

    public LegendItemSettings getLegendItem() {
        if (getLegendItem == null)
            getLegendItem = new LegendItemSettings(jsBase + ".legendItem()");

        return getLegendItem;
    }

    private String legendItem;

    public void setLegenditem(String legendItem) {
        if (jsBase == null) {
            this.legendItem = legendItem;
        } else {
            this.legendItem = legendItem;

            js.append(String.format(Locale.US, jsBase + ".legendItem(%s);", legendItem));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".legendItem(%s);", legendItem));
                js.setLength(0);
            }
        }
    }

    private String type;
    private Boolean useCapture;
    private String listenerScope;

    public void setListen(String type, Boolean useCapture, String listenerScope) {
        if (jsBase == null) {
            this.type = type;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;
        } else {
            this.type = type;
            this.useCapture = useCapture;
            this.listenerScope = listenerScope;

            js.append(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type, useCapture, listenerScope));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listen(%s, %b, %s);", type, useCapture, listenerScope));
                js.setLength(0);
            }
        }
    }

    private String type1;
    private Boolean useCapture1;
    private String listenerScope1;

    public void setListenonce(String type1, Boolean useCapture1, String listenerScope1) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            
            this.type1 = type1;
            this.useCapture = null;
            this.useCapture1 = null;
            
            this.useCapture1 = useCapture1;
            this.listenerScope = null;
            this.listenerScope1 = null;
            
            this.listenerScope1 = listenerScope1;
        } else {
            this.type1 = type1;
            this.useCapture1 = useCapture1;
            this.listenerScope1 = listenerScope1;

            js.append(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".listenOnce(%s, %b, %s);", type1, useCapture1, listenerScope1));
                js.setLength(0);
            }
        }
    }

    private UiMarkersFactory getMarkers;

    public UiMarkersFactory getMarkers() {
        if (getMarkers == null)
            getMarkers = new UiMarkersFactory(jsBase + ".markers()");

        return getMarkers;
    }

    private String markers;
    private Boolean markers1;
    private String markers2;

    public void setMarkers(String markers) {
        if (jsBase == null) {
            this.markers = null;
            this.markers1 = null;
            this.markers2 = null;
            
            this.markers = markers;
        } else {
            this.markers = markers;

            js.append(String.format(Locale.US, jsBase + ".markers(%s);", markers));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".markers(%s);", markers));
                js.setLength(0);
            }
        }
    }


    public void setMarkers(Boolean markers1) {
        if (jsBase == null) {
            this.markers = null;
            this.markers1 = null;
            this.markers2 = null;
            
            this.markers1 = markers1;
        } else {
            this.markers1 = markers1;

            js.append(String.format(Locale.US, jsBase + ".markers(%b);", markers1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".markers(%b);", markers1));
                js.setLength(0);
            }
        }
    }

    private Double maxHeight;
    private String maxHeight1;

    public void setMaxheight(Double maxHeight) {
        if (jsBase == null) {
            this.maxHeight = null;
            this.maxHeight1 = null;
            
            this.maxHeight = maxHeight;
        } else {
            this.maxHeight = maxHeight;

            js.append(String.format(Locale.US, jsBase + ".maxHeight(%f);", maxHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxHeight(%f);", maxHeight));
                js.setLength(0);
            }
        }
    }


    public void setMaxheight(String maxHeight1) {
        if (jsBase == null) {
            this.maxHeight = null;
            this.maxHeight1 = null;
            
            this.maxHeight1 = maxHeight1;
        } else {
            this.maxHeight1 = maxHeight1;

            js.append(String.format(Locale.US, jsBase + ".maxHeight(%s);", maxHeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxHeight(%s);", maxHeight1));
                js.setLength(0);
            }
        }
    }

    private Double maxWidth;
    private String maxWidth1;

    public void setMaxwidth(Double maxWidth) {
        if (jsBase == null) {
            this.maxWidth = null;
            this.maxWidth1 = null;
            
            this.maxWidth = maxWidth;
        } else {
            this.maxWidth = maxWidth;

            js.append(String.format(Locale.US, jsBase + ".maxWidth(%f);", maxWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxWidth(%f);", maxWidth));
                js.setLength(0);
            }
        }
    }


    public void setMaxwidth(String maxWidth1) {
        if (jsBase == null) {
            this.maxWidth = null;
            this.maxWidth1 = null;
            
            this.maxWidth1 = maxWidth1;
        } else {
            this.maxWidth1 = maxWidth1;

            js.append(String.format(Locale.US, jsBase + ".maxWidth(%s);", maxWidth1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".maxWidth(%s);", maxWidth1));
                js.setLength(0);
            }
        }
    }

    private Double minHeight;
    private String minHeight1;

    public void setMinheight(Double minHeight) {
        if (jsBase == null) {
            this.minHeight = null;
            this.minHeight1 = null;
            
            this.minHeight = minHeight;
        } else {
            this.minHeight = minHeight;

            js.append(String.format(Locale.US, jsBase + ".minHeight(%f);", minHeight));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minHeight(%f);", minHeight));
                js.setLength(0);
            }
        }
    }


    public void setMinheight(String minHeight1) {
        if (jsBase == null) {
            this.minHeight = null;
            this.minHeight1 = null;
            
            this.minHeight1 = minHeight1;
        } else {
            this.minHeight1 = minHeight1;

            js.append(String.format(Locale.US, jsBase + ".minHeight(%s);", minHeight1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minHeight(%s);", minHeight1));
                js.setLength(0);
            }
        }
    }

    private Double minWidth;
    private String minWidth1;

    public void setMinwidth(Double minWidth) {
        if (jsBase == null) {
            this.minWidth = null;
            this.minWidth1 = null;
            
            this.minWidth = minWidth;
        } else {
            this.minWidth = minWidth;

            js.append(String.format(Locale.US, jsBase + ".minWidth(%f);", minWidth));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minWidth(%f);", minWidth));
                js.setLength(0);
            }
        }
    }


    public void setMinwidth(String minWidth1) {
        if (jsBase == null) {
            this.minWidth = null;
            this.minWidth1 = null;
            
            this.minWidth1 = minWidth1;
        } else {
            this.minWidth1 = minWidth1;

            js.append(String.format(Locale.US, jsBase + ".minWidth(%s);", minWidth1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".minWidth(%s);", minWidth1));
                js.setLength(0);
            }
        }
    }

    private String name;

    public void setName(String name) {
        if (jsBase == null) {
            this.name = name;
        } else {
            this.name = name;

            js.append(String.format(Locale.US, jsBase + ".name(%s);", name));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".name(%s);", name));
                js.setLength(0);
            }
        }
    }

    private Fill negativeFill;

    public void setNegativefill(Fill negativeFill) {
        if (jsBase == null) {
            this.negativeFill = negativeFill;
        } else {
            this.negativeFill = negativeFill;

            js.append(String.format(Locale.US, jsBase + ".negativeFill(%s);", (negativeFill != null) ? negativeFill.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".negativeFill(%s);", (negativeFill != null) ? negativeFill.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String color13;
    private Double opacity9;

    public void setNegativefill(String color13, Double opacity9) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            
            this.color13 = color13;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            
            this.opacity9 = opacity9;
        } else {
            this.color13 = color13;
            this.opacity9 = opacity9;

            js.append(String.format(Locale.US, jsBase + ".negativeFill(%s, %f);", color13, opacity9));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".negativeFill(%s, %f);", color13, opacity9));
                js.setLength(0);
            }
        }
    }

    private GradientKey[] keys12;
    private String[] keys13;
    private Double angle3;
    private Boolean mode12;
    private VectorRect mode13;
    private String mode14;
    private Double opacity10;

    public void setNegativefill(GradientKey[] keys12, Boolean mode12, Double angle3, Double opacity10) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            
            this.keys12 = keys12;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            
            this.mode12 = mode12;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            
            this.angle3 = angle3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            
            this.opacity10 = opacity10;
        } else {
            this.keys12 = keys12;
            this.mode12 = mode12;
            this.angle3 = angle3;
            this.opacity10 = opacity10;

            js.append(String.format(Locale.US, jsBase + ".negativeFill(%s, %b, %f, %f);", arrayToString(keys12), mode12, angle3, opacity10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".negativeFill(%s, %b, %f, %f);", arrayToString(keys12), mode12, angle3, opacity10));
                js.setLength(0);
            }
        }
    }


    public void setNegativefill(GradientKey[] keys12, VectorRect mode13, Double angle3, Double opacity10) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            
            this.keys12 = keys12;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            
            this.mode13 = mode13;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            
            this.angle3 = angle3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            
            this.opacity10 = opacity10;
        } else {
            this.keys12 = keys12;
            this.mode13 = mode13;
            this.angle3 = angle3;
            this.opacity10 = opacity10;

            js.append(String.format(Locale.US, jsBase + ".negativeFill(%s, %s, %f, %f);", arrayToString(keys12), (mode13 != null) ? mode13.generateJs() : "null", angle3, opacity10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".negativeFill(%s, %s, %f, %f);", arrayToString(keys12), (mode13 != null) ? mode13.generateJs() : "null", angle3, opacity10));
                js.setLength(0);
            }
        }
    }


    public void setNegativefill(GradientKey[] keys12, String mode14, Double angle3, Double opacity10) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            
            this.keys12 = keys12;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            
            this.mode14 = mode14;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            
            this.angle3 = angle3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            
            this.opacity10 = opacity10;
        } else {
            this.keys12 = keys12;
            this.mode14 = mode14;
            this.angle3 = angle3;
            this.opacity10 = opacity10;

            js.append(String.format(Locale.US, jsBase + ".negativeFill(%s, %s, %f, %f);", arrayToString(keys12), mode14, angle3, opacity10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".negativeFill(%s, %s, %f, %f);", arrayToString(keys12), mode14, angle3, opacity10));
                js.setLength(0);
            }
        }
    }


    public void setNegativefill(String[] keys13, Boolean mode12, Double angle3, Double opacity10) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            
            this.keys13 = keys13;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            
            this.mode12 = mode12;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            
            this.angle3 = angle3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            
            this.opacity10 = opacity10;
        } else {
            this.keys13 = keys13;
            this.mode12 = mode12;
            this.angle3 = angle3;
            this.opacity10 = opacity10;

            js.append(String.format(Locale.US, jsBase + ".negativeFill(%s, %b, %f, %f);", Arrays.toString(keys13), mode12, angle3, opacity10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".negativeFill(%s, %b, %f, %f);", Arrays.toString(keys13), mode12, angle3, opacity10));
                js.setLength(0);
            }
        }
    }


    public void setNegativefill(String[] keys13, VectorRect mode13, Double angle3, Double opacity10) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            
            this.keys13 = keys13;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            
            this.mode13 = mode13;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            
            this.angle3 = angle3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            
            this.opacity10 = opacity10;
        } else {
            this.keys13 = keys13;
            this.mode13 = mode13;
            this.angle3 = angle3;
            this.opacity10 = opacity10;

            js.append(String.format(Locale.US, jsBase + ".negativeFill(%s, %s, %f, %f);", Arrays.toString(keys13), (mode13 != null) ? mode13.generateJs() : "null", angle3, opacity10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".negativeFill(%s, %s, %f, %f);", Arrays.toString(keys13), (mode13 != null) ? mode13.generateJs() : "null", angle3, opacity10));
                js.setLength(0);
            }
        }
    }


    public void setNegativefill(String[] keys13, String mode14, Double angle3, Double opacity10) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            
            this.keys13 = keys13;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            
            this.mode14 = mode14;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            
            this.angle3 = angle3;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            
            this.opacity10 = opacity10;
        } else {
            this.keys13 = keys13;
            this.mode14 = mode14;
            this.angle3 = angle3;
            this.opacity10 = opacity10;

            js.append(String.format(Locale.US, jsBase + ".negativeFill(%s, %s, %f, %f);", Arrays.toString(keys13), mode14, angle3, opacity10));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".negativeFill(%s, %s, %f, %f);", Arrays.toString(keys13), mode14, angle3, opacity10));
                js.setLength(0);
            }
        }
    }

    private GradientKey[] keys14;
    private String[] keys15;
    private Double cx3;
    private Double cy3;
    private GraphicsMathRect mode15;
    private Double opacity11;
    private Double fx3;
    private Double fy3;

    public void setNegativefill(GradientKey[] keys14, Double cx3, Double cy3, GraphicsMathRect mode15, Double opacity11, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            
            this.keys14 = keys14;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            
            this.cx3 = cx3;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            
            this.cy3 = cy3;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            
            this.mode15 = mode15;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            
            this.opacity11 = opacity11;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.keys14 = keys14;
            this.cx3 = cx3;
            this.cy3 = cy3;
            this.mode15 = mode15;
            this.opacity11 = opacity11;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".negativeFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys14), cx3, cy3, (mode15 != null) ? mode15.generateJs() : "null", opacity11, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".negativeFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys14), cx3, cy3, (mode15 != null) ? mode15.generateJs() : "null", opacity11, fx3, fy3));
                js.setLength(0);
            }
        }
    }


    public void setNegativefill(String[] keys15, Double cx3, Double cy3, GraphicsMathRect mode15, Double opacity11, Double fx3, Double fy3) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            
            this.keys15 = keys15;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            
            this.cx3 = cx3;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            
            this.cy3 = cy3;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            
            this.mode15 = mode15;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            
            this.opacity11 = opacity11;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            
            this.fx3 = fx3;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            
            this.fy3 = fy3;
        } else {
            this.keys15 = keys15;
            this.cx3 = cx3;
            this.cy3 = cy3;
            this.mode15 = mode15;
            this.opacity11 = opacity11;
            this.fx3 = fx3;
            this.fy3 = fy3;

            js.append(String.format(Locale.US, jsBase + ".negativeFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys15), cx3, cy3, (mode15 != null) ? mode15.generateJs() : "null", opacity11, fx3, fy3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".negativeFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys15), cx3, cy3, (mode15 != null) ? mode15.generateJs() : "null", opacity11, fx3, fy3));
                js.setLength(0);
            }
        }
    }

    private Fill imageSettings3;
    private PatternFill getNegativeHatchFill;

    public PatternFill getNegativeHatchFill() {
        if (getNegativeHatchFill == null)
            getNegativeHatchFill = new PatternFill(jsBase + ".negativeHatchFill()");

        return getNegativeHatchFill;
    }

    private PatternFill patternFillOrTypeOrState15;
    private HatchFill patternFillOrTypeOrState16;
    private HatchFillType patternFillOrTypeOrState17;
    private String patternFillOrTypeOrState18;
    private Boolean patternFillOrTypeOrState19;
    private String color14;
    private Double thickness5;
    private Double size3;

    public void setNegativehatchfill(PatternFill patternFillOrTypeOrState15, String color14, Double thickness5, Double size3) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            this.patternFillOrTypeOrState10 = null;
            this.patternFillOrTypeOrState11 = null;
            this.patternFillOrTypeOrState12 = null;
            this.patternFillOrTypeOrState13 = null;
            this.patternFillOrTypeOrState14 = null;
            this.patternFillOrTypeOrState15 = null;
            this.patternFillOrTypeOrState16 = null;
            this.patternFillOrTypeOrState17 = null;
            this.patternFillOrTypeOrState18 = null;
            this.patternFillOrTypeOrState19 = null;
            
            this.patternFillOrTypeOrState15 = patternFillOrTypeOrState15;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            
            this.color14 = color14;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            
            this.thickness5 = thickness5;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            
            this.size3 = size3;
        } else {
            this.patternFillOrTypeOrState15 = patternFillOrTypeOrState15;
            this.color14 = color14;
            this.thickness5 = thickness5;
            this.size3 = size3;

            js.append(String.format(Locale.US, jsBase + ".negativeHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState15 != null) ? patternFillOrTypeOrState15.generateJs() : "null", color14, thickness5, size3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".negativeHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState15 != null) ? patternFillOrTypeOrState15.generateJs() : "null", color14, thickness5, size3));
                js.setLength(0);
            }
        }
    }


    public void setNegativehatchfill(HatchFill patternFillOrTypeOrState16, String color14, Double thickness5, Double size3) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            this.patternFillOrTypeOrState10 = null;
            this.patternFillOrTypeOrState11 = null;
            this.patternFillOrTypeOrState12 = null;
            this.patternFillOrTypeOrState13 = null;
            this.patternFillOrTypeOrState14 = null;
            this.patternFillOrTypeOrState15 = null;
            this.patternFillOrTypeOrState16 = null;
            this.patternFillOrTypeOrState17 = null;
            this.patternFillOrTypeOrState18 = null;
            this.patternFillOrTypeOrState19 = null;
            
            this.patternFillOrTypeOrState16 = patternFillOrTypeOrState16;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            
            this.color14 = color14;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            
            this.thickness5 = thickness5;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            
            this.size3 = size3;
        } else {
            this.patternFillOrTypeOrState16 = patternFillOrTypeOrState16;
            this.color14 = color14;
            this.thickness5 = thickness5;
            this.size3 = size3;

            js.append(String.format(Locale.US, jsBase + ".negativeHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState16 != null) ? patternFillOrTypeOrState16.generateJs() : "null", color14, thickness5, size3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".negativeHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState16 != null) ? patternFillOrTypeOrState16.generateJs() : "null", color14, thickness5, size3));
                js.setLength(0);
            }
        }
    }


    public void setNegativehatchfill(HatchFillType patternFillOrTypeOrState17, String color14, Double thickness5, Double size3) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            this.patternFillOrTypeOrState10 = null;
            this.patternFillOrTypeOrState11 = null;
            this.patternFillOrTypeOrState12 = null;
            this.patternFillOrTypeOrState13 = null;
            this.patternFillOrTypeOrState14 = null;
            this.patternFillOrTypeOrState15 = null;
            this.patternFillOrTypeOrState16 = null;
            this.patternFillOrTypeOrState17 = null;
            this.patternFillOrTypeOrState18 = null;
            this.patternFillOrTypeOrState19 = null;
            
            this.patternFillOrTypeOrState17 = patternFillOrTypeOrState17;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            
            this.color14 = color14;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            
            this.thickness5 = thickness5;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            
            this.size3 = size3;
        } else {
            this.patternFillOrTypeOrState17 = patternFillOrTypeOrState17;
            this.color14 = color14;
            this.thickness5 = thickness5;
            this.size3 = size3;

            js.append(String.format(Locale.US, jsBase + ".negativeHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState17 != null) ? patternFillOrTypeOrState17.generateJs() : "null", color14, thickness5, size3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".negativeHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState17 != null) ? patternFillOrTypeOrState17.generateJs() : "null", color14, thickness5, size3));
                js.setLength(0);
            }
        }
    }


    public void setNegativehatchfill(String patternFillOrTypeOrState18, String color14, Double thickness5, Double size3) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            this.patternFillOrTypeOrState10 = null;
            this.patternFillOrTypeOrState11 = null;
            this.patternFillOrTypeOrState12 = null;
            this.patternFillOrTypeOrState13 = null;
            this.patternFillOrTypeOrState14 = null;
            this.patternFillOrTypeOrState15 = null;
            this.patternFillOrTypeOrState16 = null;
            this.patternFillOrTypeOrState17 = null;
            this.patternFillOrTypeOrState18 = null;
            this.patternFillOrTypeOrState19 = null;
            
            this.patternFillOrTypeOrState18 = patternFillOrTypeOrState18;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            
            this.color14 = color14;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            
            this.thickness5 = thickness5;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            
            this.size3 = size3;
        } else {
            this.patternFillOrTypeOrState18 = patternFillOrTypeOrState18;
            this.color14 = color14;
            this.thickness5 = thickness5;
            this.size3 = size3;

            js.append(String.format(Locale.US, jsBase + ".negativeHatchFill(%s, %s, %f, %f);", patternFillOrTypeOrState18, color14, thickness5, size3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".negativeHatchFill(%s, %s, %f, %f);", patternFillOrTypeOrState18, color14, thickness5, size3));
                js.setLength(0);
            }
        }
    }


    public void setNegativehatchfill(Boolean patternFillOrTypeOrState19, String color14, Double thickness5, Double size3) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            this.patternFillOrTypeOrState10 = null;
            this.patternFillOrTypeOrState11 = null;
            this.patternFillOrTypeOrState12 = null;
            this.patternFillOrTypeOrState13 = null;
            this.patternFillOrTypeOrState14 = null;
            this.patternFillOrTypeOrState15 = null;
            this.patternFillOrTypeOrState16 = null;
            this.patternFillOrTypeOrState17 = null;
            this.patternFillOrTypeOrState18 = null;
            this.patternFillOrTypeOrState19 = null;
            
            this.patternFillOrTypeOrState19 = patternFillOrTypeOrState19;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            
            this.color14 = color14;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            
            this.thickness5 = thickness5;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            
            this.size3 = size3;
        } else {
            this.patternFillOrTypeOrState19 = patternFillOrTypeOrState19;
            this.color14 = color14;
            this.thickness5 = thickness5;
            this.size3 = size3;

            js.append(String.format(Locale.US, jsBase + ".negativeHatchFill(%b, %s, %f, %f);", patternFillOrTypeOrState19, color14, thickness5, size3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".negativeHatchFill(%b, %s, %f, %f);", patternFillOrTypeOrState19, color14, thickness5, size3));
                js.setLength(0);
            }
        }
    }

    private MapSeriesBubble getNegativeStroke;

    public MapSeriesBubble getNegativeStroke() {
        if (getNegativeStroke == null)
            getNegativeStroke = new MapSeriesBubble(jsBase + ".negativeStroke()");

        return getNegativeStroke;
    }

    private Stroke color15;
    private ColoredFill color16;
    private String color17;
    private Double thickness6;
    private String dashpattern2;
    private StrokeLineJoin lineJoin2;
    private StrokeLineCap lineCap2;

    public void setNegativestroke(Stroke color15, Double thickness6, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            
            this.color15 = color15;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            
            this.thickness6 = thickness6;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            
            this.dashpattern2 = dashpattern2;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            
            this.lineJoin2 = lineJoin2;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            
            this.lineCap2 = lineCap2;
        } else {
            this.color15 = color15;
            this.thickness6 = thickness6;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;

            js.append(String.format(Locale.US, jsBase + ".negativeStroke(%s, %f, %s, %s, %s);", (color15 != null) ? color15.generateJs() : "null", thickness6, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".negativeStroke(%s, %f, %s, %s, %s);", (color15 != null) ? color15.generateJs() : "null", thickness6, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setNegativestroke(ColoredFill color16, Double thickness6, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            
            this.color16 = color16;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            
            this.thickness6 = thickness6;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            
            this.dashpattern2 = dashpattern2;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            
            this.lineJoin2 = lineJoin2;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            
            this.lineCap2 = lineCap2;
        } else {
            this.color16 = color16;
            this.thickness6 = thickness6;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;

            js.append(String.format(Locale.US, jsBase + ".negativeStroke(%s, %f, %s, %s, %s);", (color16 != null) ? color16.generateJs() : "null", thickness6, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".negativeStroke(%s, %f, %s, %s, %s);", (color16 != null) ? color16.generateJs() : "null", thickness6, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setNegativestroke(String color17, Double thickness6, String dashpattern2, StrokeLineJoin lineJoin2, StrokeLineCap lineCap2) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            
            this.color17 = color17;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            
            this.thickness6 = thickness6;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            
            this.dashpattern2 = dashpattern2;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            
            this.lineJoin2 = lineJoin2;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            
            this.lineCap2 = lineCap2;
        } else {
            this.color17 = color17;
            this.thickness6 = thickness6;
            this.dashpattern2 = dashpattern2;
            this.lineJoin2 = lineJoin2;
            this.lineCap2 = lineCap2;

            js.append(String.format(Locale.US, jsBase + ".negativeStroke(%s, %f, %s, %s, %s);", color17, thickness6, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".negativeStroke(%s, %f, %s, %s, %s);", color17, thickness6, dashpattern2, (lineJoin2 != null) ? lineJoin2.generateJs() : "null", (lineCap2 != null) ? lineCap2.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private LabelsOverlapMode overlapMode;
    private String overlapMode1;
    private Boolean overlapMode2;

    public void setOverlapmode(LabelsOverlapMode overlapMode) {
        if (jsBase == null) {
            this.overlapMode = null;
            this.overlapMode1 = null;
            this.overlapMode2 = null;
            
            this.overlapMode = overlapMode;
        } else {
            this.overlapMode = overlapMode;

            js.append(String.format(Locale.US, jsBase + ".overlapMode(%s);", (overlapMode != null) ? overlapMode.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".overlapMode(%s);", (overlapMode != null) ? overlapMode.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setOverlapmode(String overlapMode1) {
        if (jsBase == null) {
            this.overlapMode = null;
            this.overlapMode1 = null;
            this.overlapMode2 = null;
            
            this.overlapMode1 = overlapMode1;
        } else {
            this.overlapMode1 = overlapMode1;

            js.append(String.format(Locale.US, jsBase + ".overlapMode(%s);", overlapMode1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".overlapMode(%s);", overlapMode1));
                js.setLength(0);
            }
        }
    }


    public void setOverlapmode(Boolean overlapMode2) {
        if (jsBase == null) {
            this.overlapMode = null;
            this.overlapMode1 = null;
            this.overlapMode2 = null;
            
            this.overlapMode2 = overlapMode2;
        } else {
            this.overlapMode2 = overlapMode2;

            js.append(String.format(Locale.US, jsBase + ".overlapMode(%b);", overlapMode2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".overlapMode(%b);", overlapMode2));
                js.setLength(0);
            }
        }
    }

    private PaperSize paperSizeOrOptions;
    private String paperSizeOrOptions1;
    private Boolean landscape;

    public void setPrint(PaperSize paperSizeOrOptions, Boolean landscape) {
        if (jsBase == null) {
            this.paperSizeOrOptions = null;
            this.paperSizeOrOptions1 = null;
            
            this.paperSizeOrOptions = paperSizeOrOptions;
            this.landscape = landscape;
        } else {
            this.paperSizeOrOptions = paperSizeOrOptions;
            this.landscape = landscape;

            js.append(String.format(Locale.US, jsBase + ".print(%s, %b);", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null", landscape));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".print(%s, %b);", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null", landscape));
                js.setLength(0);
            }
        }
    }


    public void setPrint(String paperSizeOrOptions1, Boolean landscape) {
        if (jsBase == null) {
            this.paperSizeOrOptions = null;
            this.paperSizeOrOptions1 = null;
            
            this.paperSizeOrOptions1 = paperSizeOrOptions1;
            this.landscape = landscape;
        } else {
            this.paperSizeOrOptions1 = paperSizeOrOptions1;
            this.landscape = landscape;

            js.append(String.format(Locale.US, jsBase + ".print(%s, %b);", paperSizeOrOptions1, landscape));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".print(%s, %b);", paperSizeOrOptions1, landscape));
                js.setLength(0);
            }
        }
    }

    private String type2;

    public void setRemovealllisteners(String type2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            
            this.type2 = type2;
        } else {
            this.type2 = type2;

            js.append(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", type2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".removeAllListeners(%s);", type2));
                js.setLength(0);
            }
        }
    }

    private Double right;
    private String right1;

    public void setRight(Double right) {
        if (jsBase == null) {
            this.right = null;
            this.right1 = null;
            
            this.right = right;
        } else {
            this.right = right;

            js.append(String.format(Locale.US, jsBase + ".right(%f);", right));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".right(%f);", right));
                js.setLength(0);
            }
        }
    }


    public void setRight(String right1) {
        if (jsBase == null) {
            this.right = null;
            this.right1 = null;
            
            this.right1 = right1;
        } else {
            this.right1 = right1;

            js.append(String.format(Locale.US, jsBase + ".right(%s);", right1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".right(%s);", right1));
                js.setLength(0);
            }
        }
    }

    private Double index2;

    public void setSelect(Double index2) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            
            this.index2 = index2;
        } else {
            this.index2 = index2;

            js.append(String.format(Locale.US, jsBase + ".select(%f);", index2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".select(%f);", index2));
                js.setLength(0);
            }
        }
    }

    private Double indexes7;
    private Double[] indexes8;

    public void setSelect(Double[] indexes8) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            this.indexes3 = null;
            this.indexes4 = null;
            this.indexes5 = null;
            this.indexes6 = null;
            this.indexes7 = null;
            this.indexes8 = null;
            
            this.indexes8 = indexes8;
        } else {
            this.indexes8 = indexes8;

            js.append(String.format(Locale.US, jsBase + ".select(%s);", Arrays.toString(indexes8)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".select(%s);", Arrays.toString(indexes8)));
                js.setLength(0);
            }
        }
    }

    private Fill selectFill;

    public void setSelectfill(Fill selectFill) {
        if (jsBase == null) {
            this.selectFill = selectFill;
        } else {
            this.selectFill = selectFill;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s);", (selectFill != null) ? selectFill.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s);", (selectFill != null) ? selectFill.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String color18;
    private Double opacity12;

    public void setSelectfill(String color18, Double opacity12) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            
            this.color18 = color18;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            
            this.opacity12 = opacity12;
        } else {
            this.color18 = color18;
            this.opacity12 = opacity12;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %f);", color18, opacity12));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %f);", color18, opacity12));
                js.setLength(0);
            }
        }
    }

    private GradientKey[] keys16;
    private String[] keys17;
    private Double angle4;
    private Boolean mode16;
    private VectorRect mode17;
    private String mode18;
    private Double opacity13;

    public void setSelectfill(GradientKey[] keys16, Boolean mode16, Double angle4, Double opacity13) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            
            this.keys16 = keys16;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            
            this.mode16 = mode16;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            
            this.angle4 = angle4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            
            this.opacity13 = opacity13;
        } else {
            this.keys16 = keys16;
            this.mode16 = mode16;
            this.angle4 = angle4;
            this.opacity13 = opacity13;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %b, %f, %f);", arrayToString(keys16), mode16, angle4, opacity13));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %b, %f, %f);", arrayToString(keys16), mode16, angle4, opacity13));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(GradientKey[] keys16, VectorRect mode17, Double angle4, Double opacity13) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            
            this.keys16 = keys16;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            
            this.mode17 = mode17;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            
            this.angle4 = angle4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            
            this.opacity13 = opacity13;
        } else {
            this.keys16 = keys16;
            this.mode17 = mode17;
            this.angle4 = angle4;
            this.opacity13 = opacity13;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %f, %f);", arrayToString(keys16), (mode17 != null) ? mode17.generateJs() : "null", angle4, opacity13));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %f, %f);", arrayToString(keys16), (mode17 != null) ? mode17.generateJs() : "null", angle4, opacity13));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(GradientKey[] keys16, String mode18, Double angle4, Double opacity13) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            
            this.keys16 = keys16;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            
            this.mode18 = mode18;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            
            this.angle4 = angle4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            
            this.opacity13 = opacity13;
        } else {
            this.keys16 = keys16;
            this.mode18 = mode18;
            this.angle4 = angle4;
            this.opacity13 = opacity13;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %f, %f);", arrayToString(keys16), mode18, angle4, opacity13));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %f, %f);", arrayToString(keys16), mode18, angle4, opacity13));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(String[] keys17, Boolean mode16, Double angle4, Double opacity13) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            
            this.keys17 = keys17;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            
            this.mode16 = mode16;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            
            this.angle4 = angle4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            
            this.opacity13 = opacity13;
        } else {
            this.keys17 = keys17;
            this.mode16 = mode16;
            this.angle4 = angle4;
            this.opacity13 = opacity13;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %b, %f, %f);", Arrays.toString(keys17), mode16, angle4, opacity13));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %b, %f, %f);", Arrays.toString(keys17), mode16, angle4, opacity13));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(String[] keys17, VectorRect mode17, Double angle4, Double opacity13) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            
            this.keys17 = keys17;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            
            this.mode17 = mode17;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            
            this.angle4 = angle4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            
            this.opacity13 = opacity13;
        } else {
            this.keys17 = keys17;
            this.mode17 = mode17;
            this.angle4 = angle4;
            this.opacity13 = opacity13;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %f, %f);", Arrays.toString(keys17), (mode17 != null) ? mode17.generateJs() : "null", angle4, opacity13));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %f, %f);", Arrays.toString(keys17), (mode17 != null) ? mode17.generateJs() : "null", angle4, opacity13));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(String[] keys17, String mode18, Double angle4, Double opacity13) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            
            this.keys17 = keys17;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            
            this.mode18 = mode18;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            
            this.angle4 = angle4;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            
            this.opacity13 = opacity13;
        } else {
            this.keys17 = keys17;
            this.mode18 = mode18;
            this.angle4 = angle4;
            this.opacity13 = opacity13;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %f, %f);", Arrays.toString(keys17), mode18, angle4, opacity13));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %s, %f, %f);", Arrays.toString(keys17), mode18, angle4, opacity13));
                js.setLength(0);
            }
        }
    }

    private GradientKey[] keys18;
    private String[] keys19;
    private Double cx4;
    private Double cy4;
    private GraphicsMathRect mode19;
    private Double opacity14;
    private Double fx4;
    private Double fy4;

    public void setSelectfill(GradientKey[] keys18, Double cx4, Double cy4, GraphicsMathRect mode19, Double opacity14, Double fx4, Double fy4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            
            this.keys18 = keys18;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            
            this.cx4 = cx4;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            
            this.cy4 = cy4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            
            this.mode19 = mode19;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            
            this.opacity14 = opacity14;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            
            this.fx4 = fx4;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            
            this.fy4 = fy4;
        } else {
            this.keys18 = keys18;
            this.cx4 = cx4;
            this.cy4 = cy4;
            this.mode19 = mode19;
            this.opacity14 = opacity14;
            this.fx4 = fx4;
            this.fy4 = fy4;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys18), cx4, cy4, (mode19 != null) ? mode19.generateJs() : "null", opacity14, fx4, fy4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys18), cx4, cy4, (mode19 != null) ? mode19.generateJs() : "null", opacity14, fx4, fy4));
                js.setLength(0);
            }
        }
    }


    public void setSelectfill(String[] keys19, Double cx4, Double cy4, GraphicsMathRect mode19, Double opacity14, Double fx4, Double fy4) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            
            this.keys19 = keys19;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            
            this.cx4 = cx4;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            
            this.cy4 = cy4;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            
            this.mode19 = mode19;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            
            this.opacity14 = opacity14;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            
            this.fx4 = fx4;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            
            this.fy4 = fy4;
        } else {
            this.keys19 = keys19;
            this.cx4 = cx4;
            this.cy4 = cy4;
            this.mode19 = mode19;
            this.opacity14 = opacity14;
            this.fx4 = fx4;
            this.fy4 = fy4;

            js.append(String.format(Locale.US, jsBase + ".selectFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys19), cx4, cy4, (mode19 != null) ? mode19.generateJs() : "null", opacity14, fx4, fy4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys19), cx4, cy4, (mode19 != null) ? mode19.generateJs() : "null", opacity14, fx4, fy4));
                js.setLength(0);
            }
        }
    }

    private Fill imageSettings4;
    private PatternFill getSelectHatchFill;

    public PatternFill getSelectHatchFill() {
        if (getSelectHatchFill == null)
            getSelectHatchFill = new PatternFill(jsBase + ".selectHatchFill()");

        return getSelectHatchFill;
    }

    private PatternFill patternFillOrTypeOrState20;
    private HatchFill patternFillOrTypeOrState21;
    private HatchFillType patternFillOrTypeOrState22;
    private String patternFillOrTypeOrState23;
    private Boolean patternFillOrTypeOrState24;
    private String color19;
    private Double thickness7;
    private Double size4;

    public void setSelecthatchfill(PatternFill patternFillOrTypeOrState20, String color19, Double thickness7, Double size4) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            this.patternFillOrTypeOrState10 = null;
            this.patternFillOrTypeOrState11 = null;
            this.patternFillOrTypeOrState12 = null;
            this.patternFillOrTypeOrState13 = null;
            this.patternFillOrTypeOrState14 = null;
            this.patternFillOrTypeOrState15 = null;
            this.patternFillOrTypeOrState16 = null;
            this.patternFillOrTypeOrState17 = null;
            this.patternFillOrTypeOrState18 = null;
            this.patternFillOrTypeOrState19 = null;
            this.patternFillOrTypeOrState20 = null;
            this.patternFillOrTypeOrState21 = null;
            this.patternFillOrTypeOrState22 = null;
            this.patternFillOrTypeOrState23 = null;
            this.patternFillOrTypeOrState24 = null;
            
            this.patternFillOrTypeOrState20 = patternFillOrTypeOrState20;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            
            this.color19 = color19;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            
            this.thickness7 = thickness7;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            this.size4 = null;
            
            this.size4 = size4;
        } else {
            this.patternFillOrTypeOrState20 = patternFillOrTypeOrState20;
            this.color19 = color19;
            this.thickness7 = thickness7;
            this.size4 = size4;

            js.append(String.format(Locale.US, jsBase + ".selectHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState20 != null) ? patternFillOrTypeOrState20.generateJs() : "null", color19, thickness7, size4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState20 != null) ? patternFillOrTypeOrState20.generateJs() : "null", color19, thickness7, size4));
                js.setLength(0);
            }
        }
    }


    public void setSelecthatchfill(HatchFill patternFillOrTypeOrState21, String color19, Double thickness7, Double size4) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            this.patternFillOrTypeOrState10 = null;
            this.patternFillOrTypeOrState11 = null;
            this.patternFillOrTypeOrState12 = null;
            this.patternFillOrTypeOrState13 = null;
            this.patternFillOrTypeOrState14 = null;
            this.patternFillOrTypeOrState15 = null;
            this.patternFillOrTypeOrState16 = null;
            this.patternFillOrTypeOrState17 = null;
            this.patternFillOrTypeOrState18 = null;
            this.patternFillOrTypeOrState19 = null;
            this.patternFillOrTypeOrState20 = null;
            this.patternFillOrTypeOrState21 = null;
            this.patternFillOrTypeOrState22 = null;
            this.patternFillOrTypeOrState23 = null;
            this.patternFillOrTypeOrState24 = null;
            
            this.patternFillOrTypeOrState21 = patternFillOrTypeOrState21;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            
            this.color19 = color19;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            
            this.thickness7 = thickness7;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            this.size4 = null;
            
            this.size4 = size4;
        } else {
            this.patternFillOrTypeOrState21 = patternFillOrTypeOrState21;
            this.color19 = color19;
            this.thickness7 = thickness7;
            this.size4 = size4;

            js.append(String.format(Locale.US, jsBase + ".selectHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState21 != null) ? patternFillOrTypeOrState21.generateJs() : "null", color19, thickness7, size4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState21 != null) ? patternFillOrTypeOrState21.generateJs() : "null", color19, thickness7, size4));
                js.setLength(0);
            }
        }
    }


    public void setSelecthatchfill(HatchFillType patternFillOrTypeOrState22, String color19, Double thickness7, Double size4) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            this.patternFillOrTypeOrState10 = null;
            this.patternFillOrTypeOrState11 = null;
            this.patternFillOrTypeOrState12 = null;
            this.patternFillOrTypeOrState13 = null;
            this.patternFillOrTypeOrState14 = null;
            this.patternFillOrTypeOrState15 = null;
            this.patternFillOrTypeOrState16 = null;
            this.patternFillOrTypeOrState17 = null;
            this.patternFillOrTypeOrState18 = null;
            this.patternFillOrTypeOrState19 = null;
            this.patternFillOrTypeOrState20 = null;
            this.patternFillOrTypeOrState21 = null;
            this.patternFillOrTypeOrState22 = null;
            this.patternFillOrTypeOrState23 = null;
            this.patternFillOrTypeOrState24 = null;
            
            this.patternFillOrTypeOrState22 = patternFillOrTypeOrState22;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            
            this.color19 = color19;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            
            this.thickness7 = thickness7;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            this.size4 = null;
            
            this.size4 = size4;
        } else {
            this.patternFillOrTypeOrState22 = patternFillOrTypeOrState22;
            this.color19 = color19;
            this.thickness7 = thickness7;
            this.size4 = size4;

            js.append(String.format(Locale.US, jsBase + ".selectHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState22 != null) ? patternFillOrTypeOrState22.generateJs() : "null", color19, thickness7, size4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState22 != null) ? patternFillOrTypeOrState22.generateJs() : "null", color19, thickness7, size4));
                js.setLength(0);
            }
        }
    }


    public void setSelecthatchfill(String patternFillOrTypeOrState23, String color19, Double thickness7, Double size4) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            this.patternFillOrTypeOrState10 = null;
            this.patternFillOrTypeOrState11 = null;
            this.patternFillOrTypeOrState12 = null;
            this.patternFillOrTypeOrState13 = null;
            this.patternFillOrTypeOrState14 = null;
            this.patternFillOrTypeOrState15 = null;
            this.patternFillOrTypeOrState16 = null;
            this.patternFillOrTypeOrState17 = null;
            this.patternFillOrTypeOrState18 = null;
            this.patternFillOrTypeOrState19 = null;
            this.patternFillOrTypeOrState20 = null;
            this.patternFillOrTypeOrState21 = null;
            this.patternFillOrTypeOrState22 = null;
            this.patternFillOrTypeOrState23 = null;
            this.patternFillOrTypeOrState24 = null;
            
            this.patternFillOrTypeOrState23 = patternFillOrTypeOrState23;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            
            this.color19 = color19;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            
            this.thickness7 = thickness7;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            this.size4 = null;
            
            this.size4 = size4;
        } else {
            this.patternFillOrTypeOrState23 = patternFillOrTypeOrState23;
            this.color19 = color19;
            this.thickness7 = thickness7;
            this.size4 = size4;

            js.append(String.format(Locale.US, jsBase + ".selectHatchFill(%s, %s, %f, %f);", patternFillOrTypeOrState23, color19, thickness7, size4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectHatchFill(%s, %s, %f, %f);", patternFillOrTypeOrState23, color19, thickness7, size4));
                js.setLength(0);
            }
        }
    }


    public void setSelecthatchfill(Boolean patternFillOrTypeOrState24, String color19, Double thickness7, Double size4) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            this.patternFillOrTypeOrState10 = null;
            this.patternFillOrTypeOrState11 = null;
            this.patternFillOrTypeOrState12 = null;
            this.patternFillOrTypeOrState13 = null;
            this.patternFillOrTypeOrState14 = null;
            this.patternFillOrTypeOrState15 = null;
            this.patternFillOrTypeOrState16 = null;
            this.patternFillOrTypeOrState17 = null;
            this.patternFillOrTypeOrState18 = null;
            this.patternFillOrTypeOrState19 = null;
            this.patternFillOrTypeOrState20 = null;
            this.patternFillOrTypeOrState21 = null;
            this.patternFillOrTypeOrState22 = null;
            this.patternFillOrTypeOrState23 = null;
            this.patternFillOrTypeOrState24 = null;
            
            this.patternFillOrTypeOrState24 = patternFillOrTypeOrState24;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            
            this.color19 = color19;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            
            this.thickness7 = thickness7;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            this.size4 = null;
            
            this.size4 = size4;
        } else {
            this.patternFillOrTypeOrState24 = patternFillOrTypeOrState24;
            this.color19 = color19;
            this.thickness7 = thickness7;
            this.size4 = size4;

            js.append(String.format(Locale.US, jsBase + ".selectHatchFill(%b, %s, %f, %f);", patternFillOrTypeOrState24, color19, thickness7, size4));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectHatchFill(%b, %s, %f, %f);", patternFillOrTypeOrState24, color19, thickness7, size4));
                js.setLength(0);
            }
        }
    }

    private UiLabelsFactory getSelectLabels;

    public UiLabelsFactory getSelectLabels() {
        if (getSelectLabels == null)
            getSelectLabels = new UiLabelsFactory(jsBase + ".selectLabels()");

        return getSelectLabels;
    }

    private String selectLabels;
    private Boolean selectLabels1;

    public void setSelectlabels(String selectLabels) {
        if (jsBase == null) {
            this.selectLabels = null;
            this.selectLabels1 = null;
            
            this.selectLabels = selectLabels;
        } else {
            this.selectLabels = selectLabels;

            js.append(String.format(Locale.US, jsBase + ".selectLabels(%s);", selectLabels));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectLabels(%s);", selectLabels));
                js.setLength(0);
            }
        }
    }


    public void setSelectlabels(Boolean selectLabels1) {
        if (jsBase == null) {
            this.selectLabels = null;
            this.selectLabels1 = null;
            
            this.selectLabels1 = selectLabels1;
        } else {
            this.selectLabels1 = selectLabels1;

            js.append(String.format(Locale.US, jsBase + ".selectLabels(%b);", selectLabels1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectLabels(%b);", selectLabels1));
                js.setLength(0);
            }
        }
    }

    private UiMarkersFactory getSelectMarkers;

    public UiMarkersFactory getSelectMarkers() {
        if (getSelectMarkers == null)
            getSelectMarkers = new UiMarkersFactory(jsBase + ".selectMarkers()");

        return getSelectMarkers;
    }

    private String selectMarkers;
    private Boolean selectMarkers1;
    private String selectMarkers2;

    public void setSelectmarkers(String selectMarkers) {
        if (jsBase == null) {
            this.selectMarkers = null;
            this.selectMarkers1 = null;
            this.selectMarkers2 = null;
            
            this.selectMarkers = selectMarkers;
        } else {
            this.selectMarkers = selectMarkers;

            js.append(String.format(Locale.US, jsBase + ".selectMarkers(%s);", selectMarkers));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectMarkers(%s);", selectMarkers));
                js.setLength(0);
            }
        }
    }


    public void setSelectmarkers(Boolean selectMarkers1) {
        if (jsBase == null) {
            this.selectMarkers = null;
            this.selectMarkers1 = null;
            this.selectMarkers2 = null;
            
            this.selectMarkers1 = selectMarkers1;
        } else {
            this.selectMarkers1 = selectMarkers1;

            js.append(String.format(Locale.US, jsBase + ".selectMarkers(%b);", selectMarkers1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectMarkers(%b);", selectMarkers1));
                js.setLength(0);
            }
        }
    }

    private Fill selectNegativeFill;

    public void setSelectnegativefill(Fill selectNegativeFill) {
        if (jsBase == null) {
            this.selectNegativeFill = selectNegativeFill;
        } else {
            this.selectNegativeFill = selectNegativeFill;

            js.append(String.format(Locale.US, jsBase + ".selectNegativeFill(%s);", (selectNegativeFill != null) ? selectNegativeFill.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectNegativeFill(%s);", (selectNegativeFill != null) ? selectNegativeFill.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private String color20;
    private Double opacity15;

    public void setSelectnegativefill(String color20, Double opacity15) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            
            this.color20 = color20;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            
            this.opacity15 = opacity15;
        } else {
            this.color20 = color20;
            this.opacity15 = opacity15;

            js.append(String.format(Locale.US, jsBase + ".selectNegativeFill(%s, %f);", color20, opacity15));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectNegativeFill(%s, %f);", color20, opacity15));
                js.setLength(0);
            }
        }
    }

    private GradientKey[] keys20;
    private String[] keys21;
    private Double angle5;
    private Boolean mode20;
    private VectorRect mode21;
    private String mode22;
    private Double opacity16;

    public void setSelectnegativefill(GradientKey[] keys20, Boolean mode20, Double angle5, Double opacity16) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            
            this.keys20 = keys20;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            
            this.mode20 = mode20;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            
            this.angle5 = angle5;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            
            this.opacity16 = opacity16;
        } else {
            this.keys20 = keys20;
            this.mode20 = mode20;
            this.angle5 = angle5;
            this.opacity16 = opacity16;

            js.append(String.format(Locale.US, jsBase + ".selectNegativeFill(%s, %b, %f, %f);", arrayToString(keys20), mode20, angle5, opacity16));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectNegativeFill(%s, %b, %f, %f);", arrayToString(keys20), mode20, angle5, opacity16));
                js.setLength(0);
            }
        }
    }


    public void setSelectnegativefill(GradientKey[] keys20, VectorRect mode21, Double angle5, Double opacity16) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            
            this.keys20 = keys20;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            
            this.mode21 = mode21;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            
            this.angle5 = angle5;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            
            this.opacity16 = opacity16;
        } else {
            this.keys20 = keys20;
            this.mode21 = mode21;
            this.angle5 = angle5;
            this.opacity16 = opacity16;

            js.append(String.format(Locale.US, jsBase + ".selectNegativeFill(%s, %s, %f, %f);", arrayToString(keys20), (mode21 != null) ? mode21.generateJs() : "null", angle5, opacity16));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectNegativeFill(%s, %s, %f, %f);", arrayToString(keys20), (mode21 != null) ? mode21.generateJs() : "null", angle5, opacity16));
                js.setLength(0);
            }
        }
    }


    public void setSelectnegativefill(GradientKey[] keys20, String mode22, Double angle5, Double opacity16) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            
            this.keys20 = keys20;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            
            this.mode22 = mode22;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            
            this.angle5 = angle5;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            
            this.opacity16 = opacity16;
        } else {
            this.keys20 = keys20;
            this.mode22 = mode22;
            this.angle5 = angle5;
            this.opacity16 = opacity16;

            js.append(String.format(Locale.US, jsBase + ".selectNegativeFill(%s, %s, %f, %f);", arrayToString(keys20), mode22, angle5, opacity16));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectNegativeFill(%s, %s, %f, %f);", arrayToString(keys20), mode22, angle5, opacity16));
                js.setLength(0);
            }
        }
    }


    public void setSelectnegativefill(String[] keys21, Boolean mode20, Double angle5, Double opacity16) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            
            this.keys21 = keys21;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            
            this.mode20 = mode20;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            
            this.angle5 = angle5;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            
            this.opacity16 = opacity16;
        } else {
            this.keys21 = keys21;
            this.mode20 = mode20;
            this.angle5 = angle5;
            this.opacity16 = opacity16;

            js.append(String.format(Locale.US, jsBase + ".selectNegativeFill(%s, %b, %f, %f);", Arrays.toString(keys21), mode20, angle5, opacity16));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectNegativeFill(%s, %b, %f, %f);", Arrays.toString(keys21), mode20, angle5, opacity16));
                js.setLength(0);
            }
        }
    }


    public void setSelectnegativefill(String[] keys21, VectorRect mode21, Double angle5, Double opacity16) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            
            this.keys21 = keys21;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            
            this.mode21 = mode21;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            
            this.angle5 = angle5;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            
            this.opacity16 = opacity16;
        } else {
            this.keys21 = keys21;
            this.mode21 = mode21;
            this.angle5 = angle5;
            this.opacity16 = opacity16;

            js.append(String.format(Locale.US, jsBase + ".selectNegativeFill(%s, %s, %f, %f);", Arrays.toString(keys21), (mode21 != null) ? mode21.generateJs() : "null", angle5, opacity16));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectNegativeFill(%s, %s, %f, %f);", Arrays.toString(keys21), (mode21 != null) ? mode21.generateJs() : "null", angle5, opacity16));
                js.setLength(0);
            }
        }
    }


    public void setSelectnegativefill(String[] keys21, String mode22, Double angle5, Double opacity16) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            
            this.keys21 = keys21;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            
            this.mode22 = mode22;
            this.angle = null;
            this.angle1 = null;
            this.angle2 = null;
            this.angle3 = null;
            this.angle4 = null;
            this.angle5 = null;
            
            this.angle5 = angle5;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            
            this.opacity16 = opacity16;
        } else {
            this.keys21 = keys21;
            this.mode22 = mode22;
            this.angle5 = angle5;
            this.opacity16 = opacity16;

            js.append(String.format(Locale.US, jsBase + ".selectNegativeFill(%s, %s, %f, %f);", Arrays.toString(keys21), mode22, angle5, opacity16));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectNegativeFill(%s, %s, %f, %f);", Arrays.toString(keys21), mode22, angle5, opacity16));
                js.setLength(0);
            }
        }
    }

    private GradientKey[] keys22;
    private String[] keys23;
    private Double cx5;
    private Double cy5;
    private GraphicsMathRect mode23;
    private Double opacity17;
    private Double fx5;
    private Double fy5;

    public void setSelectnegativefill(GradientKey[] keys22, Double cx5, Double cy5, GraphicsMathRect mode23, Double opacity17, Double fx5, Double fy5) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            
            this.keys22 = keys22;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            this.cx5 = null;
            
            this.cx5 = cx5;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            this.cy5 = null;
            
            this.cy5 = cy5;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            
            this.mode23 = mode23;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            
            this.opacity17 = opacity17;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            this.fx5 = null;
            
            this.fx5 = fx5;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            this.fy5 = null;
            
            this.fy5 = fy5;
        } else {
            this.keys22 = keys22;
            this.cx5 = cx5;
            this.cy5 = cy5;
            this.mode23 = mode23;
            this.opacity17 = opacity17;
            this.fx5 = fx5;
            this.fy5 = fy5;

            js.append(String.format(Locale.US, jsBase + ".selectNegativeFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys22), cx5, cy5, (mode23 != null) ? mode23.generateJs() : "null", opacity17, fx5, fy5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectNegativeFill(%s, %f, %f, %s, %f, %f, %f);", arrayToString(keys22), cx5, cy5, (mode23 != null) ? mode23.generateJs() : "null", opacity17, fx5, fy5));
                js.setLength(0);
            }
        }
    }


    public void setSelectnegativefill(String[] keys23, Double cx5, Double cy5, GraphicsMathRect mode23, Double opacity17, Double fx5, Double fy5) {
        if (jsBase == null) {
            this.keys = null;
            this.keys1 = null;
            this.keys2 = null;
            this.keys3 = null;
            this.keys4 = null;
            this.keys5 = null;
            this.keys6 = null;
            this.keys7 = null;
            this.keys8 = null;
            this.keys9 = null;
            this.keys10 = null;
            this.keys11 = null;
            this.keys12 = null;
            this.keys13 = null;
            this.keys14 = null;
            this.keys15 = null;
            this.keys16 = null;
            this.keys17 = null;
            this.keys18 = null;
            this.keys19 = null;
            this.keys20 = null;
            this.keys21 = null;
            this.keys22 = null;
            this.keys23 = null;
            
            this.keys23 = keys23;
            this.cx = null;
            this.cx1 = null;
            this.cx2 = null;
            this.cx3 = null;
            this.cx4 = null;
            this.cx5 = null;
            
            this.cx5 = cx5;
            this.cy = null;
            this.cy1 = null;
            this.cy2 = null;
            this.cy3 = null;
            this.cy4 = null;
            this.cy5 = null;
            
            this.cy5 = cy5;
            this.mode = null;
            this.mode1 = null;
            this.mode2 = null;
            this.mode3 = null;
            this.mode4 = null;
            this.mode5 = null;
            this.mode6 = null;
            this.mode7 = null;
            this.mode8 = null;
            this.mode9 = null;
            this.mode10 = null;
            this.mode11 = null;
            this.mode12 = null;
            this.mode13 = null;
            this.mode14 = null;
            this.mode15 = null;
            this.mode16 = null;
            this.mode17 = null;
            this.mode18 = null;
            this.mode19 = null;
            this.mode20 = null;
            this.mode21 = null;
            this.mode22 = null;
            this.mode23 = null;
            
            this.mode23 = mode23;
            this.opacity = null;
            this.opacity1 = null;
            this.opacity2 = null;
            this.opacity3 = null;
            this.opacity4 = null;
            this.opacity5 = null;
            this.opacity6 = null;
            this.opacity7 = null;
            this.opacity8 = null;
            this.opacity9 = null;
            this.opacity10 = null;
            this.opacity11 = null;
            this.opacity12 = null;
            this.opacity13 = null;
            this.opacity14 = null;
            this.opacity15 = null;
            this.opacity16 = null;
            this.opacity17 = null;
            
            this.opacity17 = opacity17;
            this.fx = null;
            this.fx1 = null;
            this.fx2 = null;
            this.fx3 = null;
            this.fx4 = null;
            this.fx5 = null;
            
            this.fx5 = fx5;
            this.fy = null;
            this.fy1 = null;
            this.fy2 = null;
            this.fy3 = null;
            this.fy4 = null;
            this.fy5 = null;
            
            this.fy5 = fy5;
        } else {
            this.keys23 = keys23;
            this.cx5 = cx5;
            this.cy5 = cy5;
            this.mode23 = mode23;
            this.opacity17 = opacity17;
            this.fx5 = fx5;
            this.fy5 = fy5;

            js.append(String.format(Locale.US, jsBase + ".selectNegativeFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys23), cx5, cy5, (mode23 != null) ? mode23.generateJs() : "null", opacity17, fx5, fy5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectNegativeFill(%s, %f, %f, %s, %f, %f, %f);", Arrays.toString(keys23), cx5, cy5, (mode23 != null) ? mode23.generateJs() : "null", opacity17, fx5, fy5));
                js.setLength(0);
            }
        }
    }

    private Fill imageSettings5;
    private PatternFill getSelectNegativeHatchFill;

    public PatternFill getSelectNegativeHatchFill() {
        if (getSelectNegativeHatchFill == null)
            getSelectNegativeHatchFill = new PatternFill(jsBase + ".selectNegativeHatchFill()");

        return getSelectNegativeHatchFill;
    }

    private PatternFill patternFillOrTypeOrState25;
    private HatchFill patternFillOrTypeOrState26;
    private HatchFillType patternFillOrTypeOrState27;
    private String patternFillOrTypeOrState28;
    private Boolean patternFillOrTypeOrState29;
    private String color21;
    private Double thickness8;
    private Double size5;

    public void setSelectnegativehatchfill(PatternFill patternFillOrTypeOrState25, String color21, Double thickness8, Double size5) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            this.patternFillOrTypeOrState10 = null;
            this.patternFillOrTypeOrState11 = null;
            this.patternFillOrTypeOrState12 = null;
            this.patternFillOrTypeOrState13 = null;
            this.patternFillOrTypeOrState14 = null;
            this.patternFillOrTypeOrState15 = null;
            this.patternFillOrTypeOrState16 = null;
            this.patternFillOrTypeOrState17 = null;
            this.patternFillOrTypeOrState18 = null;
            this.patternFillOrTypeOrState19 = null;
            this.patternFillOrTypeOrState20 = null;
            this.patternFillOrTypeOrState21 = null;
            this.patternFillOrTypeOrState22 = null;
            this.patternFillOrTypeOrState23 = null;
            this.patternFillOrTypeOrState24 = null;
            this.patternFillOrTypeOrState25 = null;
            this.patternFillOrTypeOrState26 = null;
            this.patternFillOrTypeOrState27 = null;
            this.patternFillOrTypeOrState28 = null;
            this.patternFillOrTypeOrState29 = null;
            
            this.patternFillOrTypeOrState25 = patternFillOrTypeOrState25;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            
            this.color21 = color21;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            
            this.thickness8 = thickness8;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            this.size4 = null;
            this.size5 = null;
            
            this.size5 = size5;
        } else {
            this.patternFillOrTypeOrState25 = patternFillOrTypeOrState25;
            this.color21 = color21;
            this.thickness8 = thickness8;
            this.size5 = size5;

            js.append(String.format(Locale.US, jsBase + ".selectNegativeHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState25 != null) ? patternFillOrTypeOrState25.generateJs() : "null", color21, thickness8, size5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectNegativeHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState25 != null) ? patternFillOrTypeOrState25.generateJs() : "null", color21, thickness8, size5));
                js.setLength(0);
            }
        }
    }


    public void setSelectnegativehatchfill(HatchFill patternFillOrTypeOrState26, String color21, Double thickness8, Double size5) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            this.patternFillOrTypeOrState10 = null;
            this.patternFillOrTypeOrState11 = null;
            this.patternFillOrTypeOrState12 = null;
            this.patternFillOrTypeOrState13 = null;
            this.patternFillOrTypeOrState14 = null;
            this.patternFillOrTypeOrState15 = null;
            this.patternFillOrTypeOrState16 = null;
            this.patternFillOrTypeOrState17 = null;
            this.patternFillOrTypeOrState18 = null;
            this.patternFillOrTypeOrState19 = null;
            this.patternFillOrTypeOrState20 = null;
            this.patternFillOrTypeOrState21 = null;
            this.patternFillOrTypeOrState22 = null;
            this.patternFillOrTypeOrState23 = null;
            this.patternFillOrTypeOrState24 = null;
            this.patternFillOrTypeOrState25 = null;
            this.patternFillOrTypeOrState26 = null;
            this.patternFillOrTypeOrState27 = null;
            this.patternFillOrTypeOrState28 = null;
            this.patternFillOrTypeOrState29 = null;
            
            this.patternFillOrTypeOrState26 = patternFillOrTypeOrState26;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            
            this.color21 = color21;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            
            this.thickness8 = thickness8;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            this.size4 = null;
            this.size5 = null;
            
            this.size5 = size5;
        } else {
            this.patternFillOrTypeOrState26 = patternFillOrTypeOrState26;
            this.color21 = color21;
            this.thickness8 = thickness8;
            this.size5 = size5;

            js.append(String.format(Locale.US, jsBase + ".selectNegativeHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState26 != null) ? patternFillOrTypeOrState26.generateJs() : "null", color21, thickness8, size5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectNegativeHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState26 != null) ? patternFillOrTypeOrState26.generateJs() : "null", color21, thickness8, size5));
                js.setLength(0);
            }
        }
    }


    public void setSelectnegativehatchfill(HatchFillType patternFillOrTypeOrState27, String color21, Double thickness8, Double size5) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            this.patternFillOrTypeOrState10 = null;
            this.patternFillOrTypeOrState11 = null;
            this.patternFillOrTypeOrState12 = null;
            this.patternFillOrTypeOrState13 = null;
            this.patternFillOrTypeOrState14 = null;
            this.patternFillOrTypeOrState15 = null;
            this.patternFillOrTypeOrState16 = null;
            this.patternFillOrTypeOrState17 = null;
            this.patternFillOrTypeOrState18 = null;
            this.patternFillOrTypeOrState19 = null;
            this.patternFillOrTypeOrState20 = null;
            this.patternFillOrTypeOrState21 = null;
            this.patternFillOrTypeOrState22 = null;
            this.patternFillOrTypeOrState23 = null;
            this.patternFillOrTypeOrState24 = null;
            this.patternFillOrTypeOrState25 = null;
            this.patternFillOrTypeOrState26 = null;
            this.patternFillOrTypeOrState27 = null;
            this.patternFillOrTypeOrState28 = null;
            this.patternFillOrTypeOrState29 = null;
            
            this.patternFillOrTypeOrState27 = patternFillOrTypeOrState27;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            
            this.color21 = color21;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            
            this.thickness8 = thickness8;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            this.size4 = null;
            this.size5 = null;
            
            this.size5 = size5;
        } else {
            this.patternFillOrTypeOrState27 = patternFillOrTypeOrState27;
            this.color21 = color21;
            this.thickness8 = thickness8;
            this.size5 = size5;

            js.append(String.format(Locale.US, jsBase + ".selectNegativeHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState27 != null) ? patternFillOrTypeOrState27.generateJs() : "null", color21, thickness8, size5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectNegativeHatchFill(%s, %s, %f, %f);", (patternFillOrTypeOrState27 != null) ? patternFillOrTypeOrState27.generateJs() : "null", color21, thickness8, size5));
                js.setLength(0);
            }
        }
    }


    public void setSelectnegativehatchfill(String patternFillOrTypeOrState28, String color21, Double thickness8, Double size5) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            this.patternFillOrTypeOrState10 = null;
            this.patternFillOrTypeOrState11 = null;
            this.patternFillOrTypeOrState12 = null;
            this.patternFillOrTypeOrState13 = null;
            this.patternFillOrTypeOrState14 = null;
            this.patternFillOrTypeOrState15 = null;
            this.patternFillOrTypeOrState16 = null;
            this.patternFillOrTypeOrState17 = null;
            this.patternFillOrTypeOrState18 = null;
            this.patternFillOrTypeOrState19 = null;
            this.patternFillOrTypeOrState20 = null;
            this.patternFillOrTypeOrState21 = null;
            this.patternFillOrTypeOrState22 = null;
            this.patternFillOrTypeOrState23 = null;
            this.patternFillOrTypeOrState24 = null;
            this.patternFillOrTypeOrState25 = null;
            this.patternFillOrTypeOrState26 = null;
            this.patternFillOrTypeOrState27 = null;
            this.patternFillOrTypeOrState28 = null;
            this.patternFillOrTypeOrState29 = null;
            
            this.patternFillOrTypeOrState28 = patternFillOrTypeOrState28;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            
            this.color21 = color21;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            
            this.thickness8 = thickness8;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            this.size4 = null;
            this.size5 = null;
            
            this.size5 = size5;
        } else {
            this.patternFillOrTypeOrState28 = patternFillOrTypeOrState28;
            this.color21 = color21;
            this.thickness8 = thickness8;
            this.size5 = size5;

            js.append(String.format(Locale.US, jsBase + ".selectNegativeHatchFill(%s, %s, %f, %f);", patternFillOrTypeOrState28, color21, thickness8, size5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectNegativeHatchFill(%s, %s, %f, %f);", patternFillOrTypeOrState28, color21, thickness8, size5));
                js.setLength(0);
            }
        }
    }


    public void setSelectnegativehatchfill(Boolean patternFillOrTypeOrState29, String color21, Double thickness8, Double size5) {
        if (jsBase == null) {
            this.patternFillOrTypeOrState = null;
            this.patternFillOrTypeOrState1 = null;
            this.patternFillOrTypeOrState2 = null;
            this.patternFillOrTypeOrState3 = null;
            this.patternFillOrTypeOrState4 = null;
            this.patternFillOrTypeOrState5 = null;
            this.patternFillOrTypeOrState6 = null;
            this.patternFillOrTypeOrState7 = null;
            this.patternFillOrTypeOrState8 = null;
            this.patternFillOrTypeOrState9 = null;
            this.patternFillOrTypeOrState10 = null;
            this.patternFillOrTypeOrState11 = null;
            this.patternFillOrTypeOrState12 = null;
            this.patternFillOrTypeOrState13 = null;
            this.patternFillOrTypeOrState14 = null;
            this.patternFillOrTypeOrState15 = null;
            this.patternFillOrTypeOrState16 = null;
            this.patternFillOrTypeOrState17 = null;
            this.patternFillOrTypeOrState18 = null;
            this.patternFillOrTypeOrState19 = null;
            this.patternFillOrTypeOrState20 = null;
            this.patternFillOrTypeOrState21 = null;
            this.patternFillOrTypeOrState22 = null;
            this.patternFillOrTypeOrState23 = null;
            this.patternFillOrTypeOrState24 = null;
            this.patternFillOrTypeOrState25 = null;
            this.patternFillOrTypeOrState26 = null;
            this.patternFillOrTypeOrState27 = null;
            this.patternFillOrTypeOrState28 = null;
            this.patternFillOrTypeOrState29 = null;
            
            this.patternFillOrTypeOrState29 = patternFillOrTypeOrState29;
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            
            this.color21 = color21;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            
            this.thickness8 = thickness8;
            this.size = null;
            this.size1 = null;
            this.size2 = null;
            this.size3 = null;
            this.size4 = null;
            this.size5 = null;
            
            this.size5 = size5;
        } else {
            this.patternFillOrTypeOrState29 = patternFillOrTypeOrState29;
            this.color21 = color21;
            this.thickness8 = thickness8;
            this.size5 = size5;

            js.append(String.format(Locale.US, jsBase + ".selectNegativeHatchFill(%b, %s, %f, %f);", patternFillOrTypeOrState29, color21, thickness8, size5));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectNegativeHatchFill(%b, %s, %f, %f);", patternFillOrTypeOrState29, color21, thickness8, size5));
                js.setLength(0);
            }
        }
    }

    private MapSeriesBubble getSelectNegativeStroke;

    public MapSeriesBubble getSelectNegativeStroke() {
        if (getSelectNegativeStroke == null)
            getSelectNegativeStroke = new MapSeriesBubble(jsBase + ".selectNegativeStroke()");

        return getSelectNegativeStroke;
    }

    private Stroke color22;
    private ColoredFill color23;
    private String color24;
    private Double thickness9;
    private String dashpattern3;
    private StrokeLineJoin lineJoin3;
    private StrokeLineCap lineCap3;

    public void setSelectnegativestroke(Stroke color22, Double thickness9, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            
            this.color22 = color22;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            
            this.thickness9 = thickness9;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            
            this.dashpattern3 = dashpattern3;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            
            this.lineJoin3 = lineJoin3;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            
            this.lineCap3 = lineCap3;
        } else {
            this.color22 = color22;
            this.thickness9 = thickness9;
            this.dashpattern3 = dashpattern3;
            this.lineJoin3 = lineJoin3;
            this.lineCap3 = lineCap3;

            js.append(String.format(Locale.US, jsBase + ".selectNegativeStroke(%s, %f, %s, %s, %s);", (color22 != null) ? color22.generateJs() : "null", thickness9, dashpattern3, (lineJoin3 != null) ? lineJoin3.generateJs() : "null", (lineCap3 != null) ? lineCap3.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectNegativeStroke(%s, %f, %s, %s, %s);", (color22 != null) ? color22.generateJs() : "null", thickness9, dashpattern3, (lineJoin3 != null) ? lineJoin3.generateJs() : "null", (lineCap3 != null) ? lineCap3.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setSelectnegativestroke(ColoredFill color23, Double thickness9, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            
            this.color23 = color23;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            
            this.thickness9 = thickness9;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            
            this.dashpattern3 = dashpattern3;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            
            this.lineJoin3 = lineJoin3;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            
            this.lineCap3 = lineCap3;
        } else {
            this.color23 = color23;
            this.thickness9 = thickness9;
            this.dashpattern3 = dashpattern3;
            this.lineJoin3 = lineJoin3;
            this.lineCap3 = lineCap3;

            js.append(String.format(Locale.US, jsBase + ".selectNegativeStroke(%s, %f, %s, %s, %s);", (color23 != null) ? color23.generateJs() : "null", thickness9, dashpattern3, (lineJoin3 != null) ? lineJoin3.generateJs() : "null", (lineCap3 != null) ? lineCap3.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectNegativeStroke(%s, %f, %s, %s, %s);", (color23 != null) ? color23.generateJs() : "null", thickness9, dashpattern3, (lineJoin3 != null) ? lineJoin3.generateJs() : "null", (lineCap3 != null) ? lineCap3.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setSelectnegativestroke(String color24, Double thickness9, String dashpattern3, StrokeLineJoin lineJoin3, StrokeLineCap lineCap3) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            
            this.color24 = color24;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            
            this.thickness9 = thickness9;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            
            this.dashpattern3 = dashpattern3;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            
            this.lineJoin3 = lineJoin3;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            
            this.lineCap3 = lineCap3;
        } else {
            this.color24 = color24;
            this.thickness9 = thickness9;
            this.dashpattern3 = dashpattern3;
            this.lineJoin3 = lineJoin3;
            this.lineCap3 = lineCap3;

            js.append(String.format(Locale.US, jsBase + ".selectNegativeStroke(%s, %f, %s, %s, %s);", color24, thickness9, dashpattern3, (lineJoin3 != null) ? lineJoin3.generateJs() : "null", (lineCap3 != null) ? lineCap3.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectNegativeStroke(%s, %f, %s, %s, %s);", color24, thickness9, dashpattern3, (lineJoin3 != null) ? lineJoin3.generateJs() : "null", (lineCap3 != null) ? lineCap3.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Stroke color25;
    private ColoredFill color26;
    private String color27;
    private Double thickness10;
    private String dashpattern4;
    private StrokeLineJoin lineJoin4;
    private StrokeLineCap lineCap4;

    public void setSelectstroke(Stroke color25, Double thickness10, String dashpattern4, StrokeLineJoin lineJoin4, StrokeLineCap lineCap4) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            this.color26 = null;
            this.color27 = null;
            
            this.color25 = color25;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            
            this.thickness10 = thickness10;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            
            this.dashpattern4 = dashpattern4;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            
            this.lineJoin4 = lineJoin4;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            
            this.lineCap4 = lineCap4;
        } else {
            this.color25 = color25;
            this.thickness10 = thickness10;
            this.dashpattern4 = dashpattern4;
            this.lineJoin4 = lineJoin4;
            this.lineCap4 = lineCap4;

            js.append(String.format(Locale.US, jsBase + ".selectStroke(%s, %f, %s, %s, %s);", (color25 != null) ? color25.generateJs() : "null", thickness10, dashpattern4, (lineJoin4 != null) ? lineJoin4.generateJs() : "null", (lineCap4 != null) ? lineCap4.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectStroke(%s, %f, %s, %s, %s);", (color25 != null) ? color25.generateJs() : "null", thickness10, dashpattern4, (lineJoin4 != null) ? lineJoin4.generateJs() : "null", (lineCap4 != null) ? lineCap4.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setSelectstroke(ColoredFill color26, Double thickness10, String dashpattern4, StrokeLineJoin lineJoin4, StrokeLineCap lineCap4) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            this.color26 = null;
            this.color27 = null;
            
            this.color26 = color26;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            
            this.thickness10 = thickness10;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            
            this.dashpattern4 = dashpattern4;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            
            this.lineJoin4 = lineJoin4;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            
            this.lineCap4 = lineCap4;
        } else {
            this.color26 = color26;
            this.thickness10 = thickness10;
            this.dashpattern4 = dashpattern4;
            this.lineJoin4 = lineJoin4;
            this.lineCap4 = lineCap4;

            js.append(String.format(Locale.US, jsBase + ".selectStroke(%s, %f, %s, %s, %s);", (color26 != null) ? color26.generateJs() : "null", thickness10, dashpattern4, (lineJoin4 != null) ? lineJoin4.generateJs() : "null", (lineCap4 != null) ? lineCap4.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectStroke(%s, %f, %s, %s, %s);", (color26 != null) ? color26.generateJs() : "null", thickness10, dashpattern4, (lineJoin4 != null) ? lineJoin4.generateJs() : "null", (lineCap4 != null) ? lineCap4.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setSelectstroke(String color27, Double thickness10, String dashpattern4, StrokeLineJoin lineJoin4, StrokeLineCap lineCap4) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            this.color26 = null;
            this.color27 = null;
            
            this.color27 = color27;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            
            this.thickness10 = thickness10;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            
            this.dashpattern4 = dashpattern4;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            
            this.lineJoin4 = lineJoin4;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            
            this.lineCap4 = lineCap4;
        } else {
            this.color27 = color27;
            this.thickness10 = thickness10;
            this.dashpattern4 = dashpattern4;
            this.lineJoin4 = lineJoin4;
            this.lineCap4 = lineCap4;

            js.append(String.format(Locale.US, jsBase + ".selectStroke(%s, %f, %s, %s, %s);", color27, thickness10, dashpattern4, (lineJoin4 != null) ? lineJoin4.generateJs() : "null", (lineCap4 != null) ? lineCap4.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectStroke(%s, %f, %s, %s, %s);", color27, thickness10, dashpattern4, (lineJoin4 != null) ? lineJoin4.generateJs() : "null", (lineCap4 != null) ? lineCap4.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private SelectionMode selectionMode;
    private String selectionMode1;

    public void setSelectionmode(SelectionMode selectionMode) {
        if (jsBase == null) {
            this.selectionMode = null;
            this.selectionMode1 = null;
            
            this.selectionMode = selectionMode;
        } else {
            this.selectionMode = selectionMode;

            js.append(String.format(Locale.US, jsBase + ".selectionMode(%s);", (selectionMode != null) ? selectionMode.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectionMode(%s);", (selectionMode != null) ? selectionMode.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setSelectionmode(String selectionMode1) {
        if (jsBase == null) {
            this.selectionMode = null;
            this.selectionMode1 = null;
            
            this.selectionMode1 = selectionMode1;
        } else {
            this.selectionMode1 = selectionMode1;

            js.append(String.format(Locale.US, jsBase + ".selectionMode(%s);", selectionMode1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".selectionMode(%s);", selectionMode1));
                js.setLength(0);
            }
        }
    }

    private Stroke color28;
    private ColoredFill color29;
    private String color30;
    private Double thickness11;
    private String dashpattern5;
    private StrokeLineJoin lineJoin5;
    private StrokeLineCap lineCap5;

    public void setStroke(Stroke color28, Double thickness11, String dashpattern5, StrokeLineJoin lineJoin5, StrokeLineCap lineCap5) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            this.color26 = null;
            this.color27 = null;
            this.color28 = null;
            this.color29 = null;
            this.color30 = null;
            
            this.color28 = color28;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            
            this.thickness11 = thickness11;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            
            this.dashpattern5 = dashpattern5;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            
            this.lineJoin5 = lineJoin5;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            
            this.lineCap5 = lineCap5;
        } else {
            this.color28 = color28;
            this.thickness11 = thickness11;
            this.dashpattern5 = dashpattern5;
            this.lineJoin5 = lineJoin5;
            this.lineCap5 = lineCap5;

            js.append(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", (color28 != null) ? color28.generateJs() : "null", thickness11, dashpattern5, (lineJoin5 != null) ? lineJoin5.generateJs() : "null", (lineCap5 != null) ? lineCap5.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", (color28 != null) ? color28.generateJs() : "null", thickness11, dashpattern5, (lineJoin5 != null) ? lineJoin5.generateJs() : "null", (lineCap5 != null) ? lineCap5.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setStroke(ColoredFill color29, Double thickness11, String dashpattern5, StrokeLineJoin lineJoin5, StrokeLineCap lineCap5) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            this.color26 = null;
            this.color27 = null;
            this.color28 = null;
            this.color29 = null;
            this.color30 = null;
            
            this.color29 = color29;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            
            this.thickness11 = thickness11;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            
            this.dashpattern5 = dashpattern5;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            
            this.lineJoin5 = lineJoin5;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            
            this.lineCap5 = lineCap5;
        } else {
            this.color29 = color29;
            this.thickness11 = thickness11;
            this.dashpattern5 = dashpattern5;
            this.lineJoin5 = lineJoin5;
            this.lineCap5 = lineCap5;

            js.append(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", (color29 != null) ? color29.generateJs() : "null", thickness11, dashpattern5, (lineJoin5 != null) ? lineJoin5.generateJs() : "null", (lineCap5 != null) ? lineCap5.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", (color29 != null) ? color29.generateJs() : "null", thickness11, dashpattern5, (lineJoin5 != null) ? lineJoin5.generateJs() : "null", (lineCap5 != null) ? lineCap5.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }


    public void setStroke(String color30, Double thickness11, String dashpattern5, StrokeLineJoin lineJoin5, StrokeLineCap lineCap5) {
        if (jsBase == null) {
            this.color = null;
            this.color1 = null;
            this.color2 = null;
            this.color3 = null;
            this.color4 = null;
            this.color5 = null;
            this.color6 = null;
            this.color7 = null;
            this.color8 = null;
            this.color9 = null;
            this.color10 = null;
            this.color11 = null;
            this.color12 = null;
            this.color13 = null;
            this.color14 = null;
            this.color15 = null;
            this.color16 = null;
            this.color17 = null;
            this.color18 = null;
            this.color19 = null;
            this.color20 = null;
            this.color21 = null;
            this.color22 = null;
            this.color23 = null;
            this.color24 = null;
            this.color25 = null;
            this.color26 = null;
            this.color27 = null;
            this.color28 = null;
            this.color29 = null;
            this.color30 = null;
            
            this.color30 = color30;
            this.thickness = null;
            this.thickness1 = null;
            this.thickness2 = null;
            this.thickness3 = null;
            this.thickness4 = null;
            this.thickness5 = null;
            this.thickness6 = null;
            this.thickness7 = null;
            this.thickness8 = null;
            this.thickness9 = null;
            this.thickness10 = null;
            this.thickness11 = null;
            
            this.thickness11 = thickness11;
            this.dashpattern = null;
            this.dashpattern1 = null;
            this.dashpattern2 = null;
            this.dashpattern3 = null;
            this.dashpattern4 = null;
            this.dashpattern5 = null;
            
            this.dashpattern5 = dashpattern5;
            this.lineJoin = null;
            this.lineJoin1 = null;
            this.lineJoin2 = null;
            this.lineJoin3 = null;
            this.lineJoin4 = null;
            this.lineJoin5 = null;
            
            this.lineJoin5 = lineJoin5;
            this.lineCap = null;
            this.lineCap1 = null;
            this.lineCap2 = null;
            this.lineCap3 = null;
            this.lineCap4 = null;
            this.lineCap5 = null;
            
            this.lineCap5 = lineCap5;
        } else {
            this.color30 = color30;
            this.thickness11 = thickness11;
            this.dashpattern5 = dashpattern5;
            this.lineJoin5 = lineJoin5;
            this.lineCap5 = lineCap5;

            js.append(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", color30, thickness11, dashpattern5, (lineJoin5 != null) ? lineJoin5.generateJs() : "null", (lineCap5 != null) ? lineCap5.generateJs() : "null"));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".stroke(%s, %f, %s, %s, %s);", color30, thickness11, dashpattern5, (lineJoin5 != null) ? lineJoin5.generateJs() : "null", (lineCap5 != null) ? lineCap5.generateJs() : "null"));
                js.setLength(0);
            }
        }
    }

    private Tooltip getTooltip;

    public Tooltip getTooltip() {
        if (getTooltip == null)
            getTooltip = new Tooltip(jsBase + ".tooltip()");

        return getTooltip;
    }

    private String tooltip;
    private Boolean tooltip1;

    public void setTooltip(String tooltip) {
        if (jsBase == null) {
            this.tooltip = null;
            this.tooltip1 = null;
            
            this.tooltip = tooltip;
        } else {
            this.tooltip = tooltip;

            js.append(String.format(Locale.US, jsBase + ".tooltip(%s);", tooltip));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".tooltip(%s);", tooltip));
                js.setLength(0);
            }
        }
    }


    public void setTooltip(Boolean tooltip1) {
        if (jsBase == null) {
            this.tooltip = null;
            this.tooltip1 = null;
            
            this.tooltip1 = tooltip1;
        } else {
            this.tooltip1 = tooltip1;

            js.append(String.format(Locale.US, jsBase + ".tooltip(%b);", tooltip1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".tooltip(%b);", tooltip1));
                js.setLength(0);
            }
        }
    }

    private Double top;
    private String top1;

    public void setTop(Double top) {
        if (jsBase == null) {
            this.top = null;
            this.top1 = null;
            
            this.top = top;
        } else {
            this.top = top;

            js.append(String.format(Locale.US, jsBase + ".top(%f);", top));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".top(%f);", top));
                js.setLength(0);
            }
        }
    }


    public void setTop(String top1) {
        if (jsBase == null) {
            this.top = null;
            this.top1 = null;
            
            this.top1 = top1;
        } else {
            this.top1 = top1;

            js.append(String.format(Locale.US, jsBase + ".top(%s);", top1));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".top(%s);", top1));
                js.setLength(0);
            }
        }
    }

    private Double xCoord;
    private Double yCoord;

    public void setTransformxy(Double xCoord, Double yCoord) {
        if (jsBase == null) {
            this.xCoord = xCoord;
            this.yCoord = yCoord;
        } else {
            this.xCoord = xCoord;
            this.yCoord = yCoord;

            js.append(String.format(Locale.US, jsBase + ".transformXY(%f, %f);", xCoord, yCoord));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".transformXY(%f, %f);", xCoord, yCoord));
                js.setLength(0);
            }
        }
    }

    private Double indexOrIndexes;
    private Double[] indexOrIndexes1;

    public void setUnhover(Double indexOrIndexes) {
        if (jsBase == null) {
            this.indexOrIndexes = null;
            this.indexOrIndexes1 = null;
            
            this.indexOrIndexes = indexOrIndexes;
        } else {
            this.indexOrIndexes = indexOrIndexes;

            js.append(String.format(Locale.US, jsBase + ".unhover(%f);", indexOrIndexes));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unhover(%f);", indexOrIndexes));
                js.setLength(0);
            }
        }
    }


    public void setUnhover(Double[] indexOrIndexes1) {
        if (jsBase == null) {
            this.indexOrIndexes = null;
            this.indexOrIndexes1 = null;
            
            this.indexOrIndexes1 = indexOrIndexes1;
        } else {
            this.indexOrIndexes1 = indexOrIndexes1;

            js.append(String.format(Locale.US, jsBase + ".unhover(%s);", Arrays.toString(indexOrIndexes1)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unhover(%s);", Arrays.toString(indexOrIndexes1)));
                js.setLength(0);
            }
        }
    }

    private String type3;
    private Boolean useCapture2;
    private String listenerScope2;

    public void setUnlisten(String type3, Boolean useCapture2, String listenerScope2) {
        if (jsBase == null) {
            this.type = null;
            this.type1 = null;
            this.type2 = null;
            this.type3 = null;
            
            this.type3 = type3;
            this.useCapture = null;
            this.useCapture1 = null;
            this.useCapture2 = null;
            
            this.useCapture2 = useCapture2;
            this.listenerScope = null;
            this.listenerScope1 = null;
            this.listenerScope2 = null;
            
            this.listenerScope2 = listenerScope2;
        } else {
            this.type3 = type3;
            this.useCapture2 = useCapture2;
            this.listenerScope2 = listenerScope2;

            js.append(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type3, useCapture2, listenerScope2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlisten(%s, %b, %s);", type3, useCapture2, listenerScope2));
                js.setLength(0);
            }
        }
    }

    private String key2;

    public void setUnlistenbykey(String key2) {
        if (jsBase == null) {
            this.key = null;
            this.key1 = null;
            this.key2 = null;
            
            this.key2 = key2;
        } else {
            this.key2 = key2;

            js.append(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", key2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unlistenByKey(%s);", key2));
                js.setLength(0);
            }
        }
    }

    private Double index3;

    public void setUnselect(Double index3) {
        if (jsBase == null) {
            this.index = null;
            this.index1 = null;
            this.index2 = null;
            this.index3 = null;
            
            this.index3 = index3;
        } else {
            this.index3 = index3;

            js.append(String.format(Locale.US, jsBase + ".unselect(%f);", index3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unselect(%f);", index3));
                js.setLength(0);
            }
        }
    }

    private Double[] indexes9;

    public void setUnselect(Double[] indexes9) {
        if (jsBase == null) {
            this.indexes = null;
            this.indexes1 = null;
            this.indexes2 = null;
            this.indexes3 = null;
            this.indexes4 = null;
            this.indexes5 = null;
            this.indexes6 = null;
            this.indexes7 = null;
            this.indexes8 = null;
            this.indexes9 = null;
            
            this.indexes9 = indexes9;
        } else {
            this.indexes9 = indexes9;

            js.append(String.format(Locale.US, jsBase + ".unselect(%s);", Arrays.toString(indexes9)));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".unselect(%s);", Arrays.toString(indexes9)));
                js.setLength(0);
            }
        }
    }

    private Double width2;
    private String width3;

    public void setWidth(Double width2) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            
            this.width2 = width2;
        } else {
            this.width2 = width2;

            js.append(String.format(Locale.US, jsBase + ".width(%f);", width2));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%f);", width2));
                js.setLength(0);
            }
        }
    }


    public void setWidth(String width3) {
        if (jsBase == null) {
            this.width = null;
            this.width1 = null;
            this.width2 = null;
            this.width3 = null;
            
            this.width3 = width3;
        } else {
            this.width3 = width3;

            js.append(String.format(Locale.US, jsBase + ".width(%s);", width3));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".width(%s);", width3));
                js.setLength(0);
            }
        }
    }

    private Double zIndex;

    public void setZindex(Double zIndex) {
        if (jsBase == null) {
            this.zIndex = zIndex;
        } else {
            this.zIndex = zIndex;

            js.append(String.format(Locale.US, jsBase + ".zIndex(%f);", zIndex));

            if (isRendered) {
                onChangeListener.onChange(String.format(Locale.US, jsBase + ".zIndex(%f);", zIndex));
                js.setLength(0);
            }
        }
    }

    private String generateJSgetBounds() {
        if (getBounds != null) {
            return getBounds.generateJs();
        }
        return "";
    }

    private String generateJSgetData() {
        if (getData != null) {
            return getData.generateJs();
        }
        return "";
    }

    private String generateJSgetHatchFill() {
        if (getHatchFill != null) {
            return getHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetHoverHatchFill() {
        if (getHoverHatchFill != null) {
            return getHoverHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetHoverLabels() {
        if (getHoverLabels != null) {
            return getHoverLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetHoverMarkers() {
        if (getHoverMarkers != null) {
            return getHoverMarkers.generateJs();
        }
        return "";
    }

    private String generateJSgetHoverNegativeHatchFill() {
        if (getHoverNegativeHatchFill != null) {
            return getHoverNegativeHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetHoverNegativeStroke() {
        if (getHoverNegativeStroke != null) {
            return getHoverNegativeStroke.generateJs();
        }
        return "";
    }

    private String generateJSgetLabels() {
        if (getLabels != null) {
            return getLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetLegendItem() {
        if (getLegendItem != null) {
            return getLegendItem.generateJs();
        }
        return "";
    }

    private String generateJSgetMarkers() {
        if (getMarkers != null) {
            return getMarkers.generateJs();
        }
        return "";
    }

    private String generateJSgetNegativeHatchFill() {
        if (getNegativeHatchFill != null) {
            return getNegativeHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetNegativeStroke() {
        if (getNegativeStroke != null) {
            return getNegativeStroke.generateJs();
        }
        return "";
    }

    private String generateJSgetSelectHatchFill() {
        if (getSelectHatchFill != null) {
            return getSelectHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetSelectLabels() {
        if (getSelectLabels != null) {
            return getSelectLabels.generateJs();
        }
        return "";
    }

    private String generateJSgetSelectMarkers() {
        if (getSelectMarkers != null) {
            return getSelectMarkers.generateJs();
        }
        return "";
    }

    private String generateJSgetSelectNegativeHatchFill() {
        if (getSelectNegativeHatchFill != null) {
            return getSelectNegativeHatchFill.generateJs();
        }
        return "";
    }

    private String generateJSgetSelectNegativeStroke() {
        if (getSelectNegativeStroke != null) {
            return getSelectNegativeStroke.generateJs();
        }
        return "";
    }

    private String generateJSgetTooltip() {
        if (getTooltip != null) {
            return getTooltip.generateJs();
        }
        return "";
    }

    private String generateJSbottom() {
        if (bottom != null) {
            return String.format(Locale.US, "bottom: %f,", bottom);
        }
        return "";
    }

    private String generateJSbottom1() {
        if (bottom1 != null) {
            return String.format(Locale.US, "bottom: %s,", bottom1);
        }
        return "";
    }

    private String generateJSbounds() {
        if (bounds != null) {
            return String.format(Locale.US, "bounds: %s,", (bounds != null) ? bounds.generateJs() : "null");
        }
        return "";
    }

    private String generateJSbounds1() {
        if (bounds1 != null) {
            return String.format(Locale.US, "bounds: %s,", (bounds1 != null) ? bounds1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSbounds2() {
        if (bounds2 != null) {
            return String.format(Locale.US, "bounds: %s,", (bounds2 != null) ? bounds2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSx() {
        if (x != null) {
            return String.format(Locale.US, "x: %f,", x);
        }
        return "";
    }

    private String generateJSx1() {
        if (x1 != null) {
            return String.format(Locale.US, "x: %s,", x1);
        }
        return "";
    }

    private String generateJSy() {
        if (y != null) {
            return String.format(Locale.US, "y: %f,", y);
        }
        return "";
    }

    private String generateJSy1() {
        if (y1 != null) {
            return String.format(Locale.US, "y: %s,", y1);
        }
        return "";
    }

    private String generateJSwidth() {
        if (width != null) {
            return String.format(Locale.US, "width: %f,", width);
        }
        return "";
    }

    private String generateJSwidth1() {
        if (width1 != null) {
            return String.format(Locale.US, "width: %s,", width1);
        }
        return "";
    }

    private String generateJSheight() {
        if (height != null) {
            return String.format(Locale.US, "height: %f,", height);
        }
        return "";
    }

    private String generateJSheight1() {
        if (height1 != null) {
            return String.format(Locale.US, "height: %s,", height1);
        }
        return "";
    }

    private String generateJScolor() {
        if (color != null) {
            return String.format(Locale.US, "color: %s,", color);
        }
        return "";
    }

    private String generateJSdata() {
        if (data != null) {
            return String.format(Locale.US, "data: %s,", (data != null) ? data.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata1() {
        if (data1 != null) {
            return String.format(Locale.US, "data: %s,", (data1 != null) ? data1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdata2() {
        if (data2 != null) {
            return String.format(Locale.US, "data: %s,", Arrays.toString(data2));
        }
        return "";
    }

    private String generateJSdata3() {
        if (data3 != null) {
            return String.format(Locale.US, "data: %s,", data3);
        }
        return "";
    }

    private String generateJScsvSettings() {
        if (csvSettings != null) {
            return String.format(Locale.US, "csvSettings: %s,", (csvSettings != null) ? csvSettings.generateJs() : "null");
        }
        return "";
    }

    private String generateJScsvSettings1() {
        if (csvSettings1 != null) {
            return String.format(Locale.US, "csvSettings: %s,", (csvSettings1 != null) ? csvSettings1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSdisplayNegative() {
        if (displayNegative != null) {
            return String.format(Locale.US, "displayNegative: %b,", displayNegative);
        }
        return "";
    }

    private String generateJSenabled() {
        if (enabled != null) {
            return String.format(Locale.US, "enabled: %b,", enabled);
        }
        return "";
    }

    private String generateJSindexes() {
        if (indexes != null) {
            return String.format(Locale.US, "indexes: %f,", indexes);
        }
        return "";
    }

    private String generateJSindexes1() {
        if (indexes1 != null) {
            return String.format(Locale.US, "indexes: %s,", Arrays.toString(indexes1));
        }
        return "";
    }

    private String generateJSfill() {
        if (fill != null) {
            return String.format(Locale.US, "fill: %s,", (fill != null) ? fill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor1() {
        if (color1 != null) {
            return String.format(Locale.US, "color: %s,", color1);
        }
        return "";
    }

    private String generateJSopacity() {
        if (opacity != null) {
            return String.format(Locale.US, "opacity: %f,", opacity);
        }
        return "";
    }

    private String generateJSkeys() {
        if (keys != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys));
        }
        return "";
    }

    private String generateJSkeys1() {
        if (keys1 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys1));
        }
        return "";
    }

    private String generateJSangle() {
        if (angle != null) {
            return String.format(Locale.US, "angle: %f,", angle);
        }
        return "";
    }

    private String generateJSmode() {
        if (mode != null) {
            return String.format(Locale.US, "mode: %b,", mode);
        }
        return "";
    }

    private String generateJSmode1() {
        if (mode1 != null) {
            return String.format(Locale.US, "mode: %s,", (mode1 != null) ? mode1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmode2() {
        if (mode2 != null) {
            return String.format(Locale.US, "mode: %s,", mode2);
        }
        return "";
    }

    private String generateJSopacity1() {
        if (opacity1 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity1);
        }
        return "";
    }

    private String generateJSkeys2() {
        if (keys2 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys2));
        }
        return "";
    }

    private String generateJSkeys3() {
        if (keys3 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys3));
        }
        return "";
    }

    private String generateJScx() {
        if (cx != null) {
            return String.format(Locale.US, "cx: %f,", cx);
        }
        return "";
    }

    private String generateJScy() {
        if (cy != null) {
            return String.format(Locale.US, "cy: %f,", cy);
        }
        return "";
    }

    private String generateJSmode3() {
        if (mode3 != null) {
            return String.format(Locale.US, "mode: %s,", (mode3 != null) ? mode3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity2() {
        if (opacity2 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity2);
        }
        return "";
    }

    private String generateJSfx() {
        if (fx != null) {
            return String.format(Locale.US, "fx: %f,", fx);
        }
        return "";
    }

    private String generateJSfy() {
        if (fy != null) {
            return String.format(Locale.US, "fy: %f,", fy);
        }
        return "";
    }

    private String generateJSimageSettings() {
        if (imageSettings != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings != null) ? imageSettings.generateJs() : "null");
        }
        return "";
    }

    private String generateJSgeoIdField() {
        if (geoIdField != null) {
            return String.format(Locale.US, "geoIdField: %s,", geoIdField);
        }
        return "";
    }

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %f,", index);
        }
        return "";
    }

    private String generateJSkey() {
        if (key != null) {
            return String.format(Locale.US, "key: %s,", key);
        }
        return "";
    }

    private String generateJSkey1() {
        if (key1 != null) {
            return String.format(Locale.US, "key: %s,", (key1 != null) ? key1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState() {
        if (patternFillOrTypeOrState != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState != null) ? patternFillOrTypeOrState.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState1() {
        if (patternFillOrTypeOrState1 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState1 != null) ? patternFillOrTypeOrState1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState2() {
        if (patternFillOrTypeOrState2 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState2 != null) ? patternFillOrTypeOrState2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState3() {
        if (patternFillOrTypeOrState3 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", patternFillOrTypeOrState3);
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState4() {
        if (patternFillOrTypeOrState4 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %b,", patternFillOrTypeOrState4);
        }
        return "";
    }

    private String generateJScolor2() {
        if (color2 != null) {
            return String.format(Locale.US, "color: %s,", color2);
        }
        return "";
    }

    private String generateJSthickness() {
        if (thickness != null) {
            return String.format(Locale.US, "thickness: %f,", thickness);
        }
        return "";
    }

    private String generateJSsize() {
        if (size != null) {
            return String.format(Locale.US, "size: %f,", size);
        }
        return "";
    }

    private String generateJSheight2() {
        if (height2 != null) {
            return String.format(Locale.US, "height: %f,", height2);
        }
        return "";
    }

    private String generateJSheight3() {
        if (height3 != null) {
            return String.format(Locale.US, "height: %s,", height3);
        }
        return "";
    }

    private String generateJSindex1() {
        if (index1 != null) {
            return String.format(Locale.US, "index: %f,", index1);
        }
        return "";
    }

    private String generateJSindexes2() {
        if (indexes2 != null) {
            return String.format(Locale.US, "indexes: %s,", Arrays.toString(indexes2));
        }
        return "";
    }

    private String generateJShoverFill() {
        if (hoverFill != null) {
            return String.format(Locale.US, "hoverFill: %s,", (hoverFill != null) ? hoverFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor3() {
        if (color3 != null) {
            return String.format(Locale.US, "color: %s,", color3);
        }
        return "";
    }

    private String generateJSopacity3() {
        if (opacity3 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity3);
        }
        return "";
    }

    private String generateJSkeys4() {
        if (keys4 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys4));
        }
        return "";
    }

    private String generateJSkeys5() {
        if (keys5 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys5));
        }
        return "";
    }

    private String generateJSangle1() {
        if (angle1 != null) {
            return String.format(Locale.US, "angle: %f,", angle1);
        }
        return "";
    }

    private String generateJSmode4() {
        if (mode4 != null) {
            return String.format(Locale.US, "mode: %b,", mode4);
        }
        return "";
    }

    private String generateJSmode5() {
        if (mode5 != null) {
            return String.format(Locale.US, "mode: %s,", (mode5 != null) ? mode5.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmode6() {
        if (mode6 != null) {
            return String.format(Locale.US, "mode: %s,", mode6);
        }
        return "";
    }

    private String generateJSopacity4() {
        if (opacity4 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity4);
        }
        return "";
    }

    private String generateJSkeys6() {
        if (keys6 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys6));
        }
        return "";
    }

    private String generateJSkeys7() {
        if (keys7 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys7));
        }
        return "";
    }

    private String generateJScx1() {
        if (cx1 != null) {
            return String.format(Locale.US, "cx: %f,", cx1);
        }
        return "";
    }

    private String generateJScy1() {
        if (cy1 != null) {
            return String.format(Locale.US, "cy: %f,", cy1);
        }
        return "";
    }

    private String generateJSmode7() {
        if (mode7 != null) {
            return String.format(Locale.US, "mode: %s,", (mode7 != null) ? mode7.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity5() {
        if (opacity5 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity5);
        }
        return "";
    }

    private String generateJSfx1() {
        if (fx1 != null) {
            return String.format(Locale.US, "fx: %f,", fx1);
        }
        return "";
    }

    private String generateJSfy1() {
        if (fy1 != null) {
            return String.format(Locale.US, "fy: %f,", fy1);
        }
        return "";
    }

    private String generateJSimageSettings1() {
        if (imageSettings1 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings1 != null) ? imageSettings1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState5() {
        if (patternFillOrTypeOrState5 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState5 != null) ? patternFillOrTypeOrState5.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState6() {
        if (patternFillOrTypeOrState6 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState6 != null) ? patternFillOrTypeOrState6.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState7() {
        if (patternFillOrTypeOrState7 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState7 != null) ? patternFillOrTypeOrState7.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState8() {
        if (patternFillOrTypeOrState8 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", patternFillOrTypeOrState8);
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState9() {
        if (patternFillOrTypeOrState9 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %b,", patternFillOrTypeOrState9);
        }
        return "";
    }

    private String generateJScolor4() {
        if (color4 != null) {
            return String.format(Locale.US, "color: %s,", color4);
        }
        return "";
    }

    private String generateJSthickness1() {
        if (thickness1 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness1);
        }
        return "";
    }

    private String generateJSsize1() {
        if (size1 != null) {
            return String.format(Locale.US, "size: %f,", size1);
        }
        return "";
    }

    private String generateJShoverLabels() {
        if (hoverLabels != null) {
            return String.format(Locale.US, "hoverLabels: %s,", hoverLabels);
        }
        return "";
    }

    private String generateJShoverLabels1() {
        if (hoverLabels1 != null) {
            return String.format(Locale.US, "hoverLabels: %b,", hoverLabels1);
        }
        return "";
    }

    private String generateJShoverMarkers() {
        if (hoverMarkers != null) {
            return String.format(Locale.US, "hoverMarkers: %s,", hoverMarkers);
        }
        return "";
    }

    private String generateJShoverMarkers1() {
        if (hoverMarkers1 != null) {
            return String.format(Locale.US, "hoverMarkers: %b,", hoverMarkers1);
        }
        return "";
    }

    private String generateJShoverMarkers2() {
        if (hoverMarkers2 != null) {
            return String.format(Locale.US, "hoverMarkers: %s,", hoverMarkers2);
        }
        return "";
    }

    private String generateJShoverNegativeFill() {
        if (hoverNegativeFill != null) {
            return String.format(Locale.US, "hoverNegativeFill: %s,", (hoverNegativeFill != null) ? hoverNegativeFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor5() {
        if (color5 != null) {
            return String.format(Locale.US, "color: %s,", color5);
        }
        return "";
    }

    private String generateJSopacity6() {
        if (opacity6 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity6);
        }
        return "";
    }

    private String generateJSkeys8() {
        if (keys8 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys8));
        }
        return "";
    }

    private String generateJSkeys9() {
        if (keys9 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys9));
        }
        return "";
    }

    private String generateJSangle2() {
        if (angle2 != null) {
            return String.format(Locale.US, "angle: %f,", angle2);
        }
        return "";
    }

    private String generateJSmode8() {
        if (mode8 != null) {
            return String.format(Locale.US, "mode: %b,", mode8);
        }
        return "";
    }

    private String generateJSmode9() {
        if (mode9 != null) {
            return String.format(Locale.US, "mode: %s,", (mode9 != null) ? mode9.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmode10() {
        if (mode10 != null) {
            return String.format(Locale.US, "mode: %s,", mode10);
        }
        return "";
    }

    private String generateJSopacity7() {
        if (opacity7 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity7);
        }
        return "";
    }

    private String generateJSkeys10() {
        if (keys10 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys10));
        }
        return "";
    }

    private String generateJSkeys11() {
        if (keys11 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys11));
        }
        return "";
    }

    private String generateJScx2() {
        if (cx2 != null) {
            return String.format(Locale.US, "cx: %f,", cx2);
        }
        return "";
    }

    private String generateJScy2() {
        if (cy2 != null) {
            return String.format(Locale.US, "cy: %f,", cy2);
        }
        return "";
    }

    private String generateJSmode11() {
        if (mode11 != null) {
            return String.format(Locale.US, "mode: %s,", (mode11 != null) ? mode11.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity8() {
        if (opacity8 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity8);
        }
        return "";
    }

    private String generateJSfx2() {
        if (fx2 != null) {
            return String.format(Locale.US, "fx: %f,", fx2);
        }
        return "";
    }

    private String generateJSfy2() {
        if (fy2 != null) {
            return String.format(Locale.US, "fy: %f,", fy2);
        }
        return "";
    }

    private String generateJSimageSettings2() {
        if (imageSettings2 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings2 != null) ? imageSettings2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState10() {
        if (patternFillOrTypeOrState10 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState10 != null) ? patternFillOrTypeOrState10.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState11() {
        if (patternFillOrTypeOrState11 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState11 != null) ? patternFillOrTypeOrState11.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState12() {
        if (patternFillOrTypeOrState12 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState12 != null) ? patternFillOrTypeOrState12.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState13() {
        if (patternFillOrTypeOrState13 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", patternFillOrTypeOrState13);
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState14() {
        if (patternFillOrTypeOrState14 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %b,", patternFillOrTypeOrState14);
        }
        return "";
    }

    private String generateJScolor6() {
        if (color6 != null) {
            return String.format(Locale.US, "color: %s,", color6);
        }
        return "";
    }

    private String generateJSthickness2() {
        if (thickness2 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness2);
        }
        return "";
    }

    private String generateJSsize2() {
        if (size2 != null) {
            return String.format(Locale.US, "size: %f,", size2);
        }
        return "";
    }

    private String generateJScolor7() {
        if (color7 != null) {
            return String.format(Locale.US, "color: %s,", (color7 != null) ? color7.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor8() {
        if (color8 != null) {
            return String.format(Locale.US, "color: %s,", (color8 != null) ? color8.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor9() {
        if (color9 != null) {
            return String.format(Locale.US, "color: %s,", color9);
        }
        return "";
    }

    private String generateJSthickness3() {
        if (thickness3 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness3);
        }
        return "";
    }

    private String generateJSdashpattern() {
        if (dashpattern != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern);
        }
        return "";
    }

    private String generateJSlineJoin() {
        if (lineJoin != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin != null) ? lineJoin.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap() {
        if (lineCap != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap != null) ? lineCap.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor10() {
        if (color10 != null) {
            return String.format(Locale.US, "color: %s,", (color10 != null) ? color10.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor11() {
        if (color11 != null) {
            return String.format(Locale.US, "color: %s,", (color11 != null) ? color11.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor12() {
        if (color12 != null) {
            return String.format(Locale.US, "color: %s,", color12);
        }
        return "";
    }

    private String generateJSthickness4() {
        if (thickness4 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness4);
        }
        return "";
    }

    private String generateJSdashpattern1() {
        if (dashpattern1 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern1);
        }
        return "";
    }

    private String generateJSlineJoin1() {
        if (lineJoin1 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin1 != null) ? lineJoin1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap1() {
        if (lineCap1 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap1 != null) ? lineCap1.generateJs() : "null");
        }
        return "";
    }

    private String generateJSid() {
        if (id != null) {
            return String.format(Locale.US, "id: %s,", id);
        }
        return "";
    }

    private String generateJSid1() {
        if (id1 != null) {
            return String.format(Locale.US, "id: %f,", id1);
        }
        return "";
    }

    private String generateJSindexes3() {
        if (indexes3 != null) {
            return String.format(Locale.US, "indexes: %f,", indexes3);
        }
        return "";
    }

    private String generateJSindexes4() {
        if (indexes4 != null) {
            return String.format(Locale.US, "indexes: %s,", Arrays.toString(indexes4));
        }
        return "";
    }

    private String generateJSindexes5() {
        if (indexes5 != null) {
            return String.format(Locale.US, "indexes: %f,", indexes5);
        }
        return "";
    }

    private String generateJSindexes6() {
        if (indexes6 != null) {
            return String.format(Locale.US, "indexes: %s,", Arrays.toString(indexes6));
        }
        return "";
    }

    private String generateJSlabels() {
        if (labels != null) {
            return String.format(Locale.US, "labels: %s,", labels);
        }
        return "";
    }

    private String generateJSlabels1() {
        if (labels1 != null) {
            return String.format(Locale.US, "labels: %b,", labels1);
        }
        return "";
    }

    private String generateJSleft() {
        if (left != null) {
            return String.format(Locale.US, "left: %f,", left);
        }
        return "";
    }

    private String generateJSleft1() {
        if (left1 != null) {
            return String.format(Locale.US, "left: %s,", left1);
        }
        return "";
    }

    private String generateJSlegendItem() {
        if (legendItem != null) {
            return String.format(Locale.US, "legendItem: %s,", legendItem);
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", type);
        }
        return "";
    }

    private String generateJSuseCapture() {
        if (useCapture != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture);
        }
        return "";
    }

    private String generateJSlistenerScope() {
        if (listenerScope != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope);
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: %s,", type1);
        }
        return "";
    }

    private String generateJSuseCapture1() {
        if (useCapture1 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture1);
        }
        return "";
    }

    private String generateJSlistenerScope1() {
        if (listenerScope1 != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope1);
        }
        return "";
    }

    private String generateJSmarkers() {
        if (markers != null) {
            return String.format(Locale.US, "markers: %s,", markers);
        }
        return "";
    }

    private String generateJSmarkers1() {
        if (markers1 != null) {
            return String.format(Locale.US, "markers: %b,", markers1);
        }
        return "";
    }

    private String generateJSmarkers2() {
        if (markers2 != null) {
            return String.format(Locale.US, "markers: %s,", markers2);
        }
        return "";
    }

    private String generateJSmaxHeight() {
        if (maxHeight != null) {
            return String.format(Locale.US, "maxHeight: %f,", maxHeight);
        }
        return "";
    }

    private String generateJSmaxHeight1() {
        if (maxHeight1 != null) {
            return String.format(Locale.US, "maxHeight: %s,", maxHeight1);
        }
        return "";
    }

    private String generateJSmaxWidth() {
        if (maxWidth != null) {
            return String.format(Locale.US, "maxWidth: %f,", maxWidth);
        }
        return "";
    }

    private String generateJSmaxWidth1() {
        if (maxWidth1 != null) {
            return String.format(Locale.US, "maxWidth: %s,", maxWidth1);
        }
        return "";
    }

    private String generateJSminHeight() {
        if (minHeight != null) {
            return String.format(Locale.US, "minHeight: %f,", minHeight);
        }
        return "";
    }

    private String generateJSminHeight1() {
        if (minHeight1 != null) {
            return String.format(Locale.US, "minHeight: %s,", minHeight1);
        }
        return "";
    }

    private String generateJSminWidth() {
        if (minWidth != null) {
            return String.format(Locale.US, "minWidth: %f,", minWidth);
        }
        return "";
    }

    private String generateJSminWidth1() {
        if (minWidth1 != null) {
            return String.format(Locale.US, "minWidth: %s,", minWidth1);
        }
        return "";
    }

    private String generateJSname() {
        if (name != null) {
            return String.format(Locale.US, "name: %s,", name);
        }
        return "";
    }

    private String generateJSnegativeFill() {
        if (negativeFill != null) {
            return String.format(Locale.US, "negativeFill: %s,", (negativeFill != null) ? negativeFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor13() {
        if (color13 != null) {
            return String.format(Locale.US, "color: %s,", color13);
        }
        return "";
    }

    private String generateJSopacity9() {
        if (opacity9 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity9);
        }
        return "";
    }

    private String generateJSkeys12() {
        if (keys12 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys12));
        }
        return "";
    }

    private String generateJSkeys13() {
        if (keys13 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys13));
        }
        return "";
    }

    private String generateJSangle3() {
        if (angle3 != null) {
            return String.format(Locale.US, "angle: %f,", angle3);
        }
        return "";
    }

    private String generateJSmode12() {
        if (mode12 != null) {
            return String.format(Locale.US, "mode: %b,", mode12);
        }
        return "";
    }

    private String generateJSmode13() {
        if (mode13 != null) {
            return String.format(Locale.US, "mode: %s,", (mode13 != null) ? mode13.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmode14() {
        if (mode14 != null) {
            return String.format(Locale.US, "mode: %s,", mode14);
        }
        return "";
    }

    private String generateJSopacity10() {
        if (opacity10 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity10);
        }
        return "";
    }

    private String generateJSkeys14() {
        if (keys14 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys14));
        }
        return "";
    }

    private String generateJSkeys15() {
        if (keys15 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys15));
        }
        return "";
    }

    private String generateJScx3() {
        if (cx3 != null) {
            return String.format(Locale.US, "cx: %f,", cx3);
        }
        return "";
    }

    private String generateJScy3() {
        if (cy3 != null) {
            return String.format(Locale.US, "cy: %f,", cy3);
        }
        return "";
    }

    private String generateJSmode15() {
        if (mode15 != null) {
            return String.format(Locale.US, "mode: %s,", (mode15 != null) ? mode15.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity11() {
        if (opacity11 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity11);
        }
        return "";
    }

    private String generateJSfx3() {
        if (fx3 != null) {
            return String.format(Locale.US, "fx: %f,", fx3);
        }
        return "";
    }

    private String generateJSfy3() {
        if (fy3 != null) {
            return String.format(Locale.US, "fy: %f,", fy3);
        }
        return "";
    }

    private String generateJSimageSettings3() {
        if (imageSettings3 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings3 != null) ? imageSettings3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState15() {
        if (patternFillOrTypeOrState15 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState15 != null) ? patternFillOrTypeOrState15.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState16() {
        if (patternFillOrTypeOrState16 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState16 != null) ? patternFillOrTypeOrState16.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState17() {
        if (patternFillOrTypeOrState17 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState17 != null) ? patternFillOrTypeOrState17.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState18() {
        if (patternFillOrTypeOrState18 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", patternFillOrTypeOrState18);
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState19() {
        if (patternFillOrTypeOrState19 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %b,", patternFillOrTypeOrState19);
        }
        return "";
    }

    private String generateJScolor14() {
        if (color14 != null) {
            return String.format(Locale.US, "color: %s,", color14);
        }
        return "";
    }

    private String generateJSthickness5() {
        if (thickness5 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness5);
        }
        return "";
    }

    private String generateJSsize3() {
        if (size3 != null) {
            return String.format(Locale.US, "size: %f,", size3);
        }
        return "";
    }

    private String generateJScolor15() {
        if (color15 != null) {
            return String.format(Locale.US, "color: %s,", (color15 != null) ? color15.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor16() {
        if (color16 != null) {
            return String.format(Locale.US, "color: %s,", (color16 != null) ? color16.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor17() {
        if (color17 != null) {
            return String.format(Locale.US, "color: %s,", color17);
        }
        return "";
    }

    private String generateJSthickness6() {
        if (thickness6 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness6);
        }
        return "";
    }

    private String generateJSdashpattern2() {
        if (dashpattern2 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern2);
        }
        return "";
    }

    private String generateJSlineJoin2() {
        if (lineJoin2 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin2 != null) ? lineJoin2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap2() {
        if (lineCap2 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap2 != null) ? lineCap2.generateJs() : "null");
        }
        return "";
    }

    private String generateJSoverlapMode() {
        if (overlapMode != null) {
            return String.format(Locale.US, "overlapMode: %s,", (overlapMode != null) ? overlapMode.generateJs() : "null");
        }
        return "";
    }

    private String generateJSoverlapMode1() {
        if (overlapMode1 != null) {
            return String.format(Locale.US, "overlapMode: %s,", overlapMode1);
        }
        return "";
    }

    private String generateJSoverlapMode2() {
        if (overlapMode2 != null) {
            return String.format(Locale.US, "overlapMode: %b,", overlapMode2);
        }
        return "";
    }

    private String generateJSpaperSizeOrOptions() {
        if (paperSizeOrOptions != null) {
            return String.format(Locale.US, "paperSizeOrOptions: %s,", (paperSizeOrOptions != null) ? paperSizeOrOptions.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpaperSizeOrOptions1() {
        if (paperSizeOrOptions1 != null) {
            return String.format(Locale.US, "paperSizeOrOptions: %s,", paperSizeOrOptions1);
        }
        return "";
    }

    private String generateJSlandscape() {
        if (landscape != null) {
            return String.format(Locale.US, "landscape: %b,", landscape);
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
        }
        return "";
    }

    private String generateJSright() {
        if (right != null) {
            return String.format(Locale.US, "right: %f,", right);
        }
        return "";
    }

    private String generateJSright1() {
        if (right1 != null) {
            return String.format(Locale.US, "right: %s,", right1);
        }
        return "";
    }

    private String generateJSindex2() {
        if (index2 != null) {
            return String.format(Locale.US, "index: %f,", index2);
        }
        return "";
    }

    private String generateJSindexes7() {
        if (indexes7 != null) {
            return String.format(Locale.US, "indexes: %f,", indexes7);
        }
        return "";
    }

    private String generateJSindexes8() {
        if (indexes8 != null) {
            return String.format(Locale.US, "indexes: %s,", Arrays.toString(indexes8));
        }
        return "";
    }

    private String generateJSselectFill() {
        if (selectFill != null) {
            return String.format(Locale.US, "selectFill: %s,", (selectFill != null) ? selectFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor18() {
        if (color18 != null) {
            return String.format(Locale.US, "color: %s,", color18);
        }
        return "";
    }

    private String generateJSopacity12() {
        if (opacity12 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity12);
        }
        return "";
    }

    private String generateJSkeys16() {
        if (keys16 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys16));
        }
        return "";
    }

    private String generateJSkeys17() {
        if (keys17 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys17));
        }
        return "";
    }

    private String generateJSangle4() {
        if (angle4 != null) {
            return String.format(Locale.US, "angle: %f,", angle4);
        }
        return "";
    }

    private String generateJSmode16() {
        if (mode16 != null) {
            return String.format(Locale.US, "mode: %b,", mode16);
        }
        return "";
    }

    private String generateJSmode17() {
        if (mode17 != null) {
            return String.format(Locale.US, "mode: %s,", (mode17 != null) ? mode17.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmode18() {
        if (mode18 != null) {
            return String.format(Locale.US, "mode: %s,", mode18);
        }
        return "";
    }

    private String generateJSopacity13() {
        if (opacity13 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity13);
        }
        return "";
    }

    private String generateJSkeys18() {
        if (keys18 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys18));
        }
        return "";
    }

    private String generateJSkeys19() {
        if (keys19 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys19));
        }
        return "";
    }

    private String generateJScx4() {
        if (cx4 != null) {
            return String.format(Locale.US, "cx: %f,", cx4);
        }
        return "";
    }

    private String generateJScy4() {
        if (cy4 != null) {
            return String.format(Locale.US, "cy: %f,", cy4);
        }
        return "";
    }

    private String generateJSmode19() {
        if (mode19 != null) {
            return String.format(Locale.US, "mode: %s,", (mode19 != null) ? mode19.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity14() {
        if (opacity14 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity14);
        }
        return "";
    }

    private String generateJSfx4() {
        if (fx4 != null) {
            return String.format(Locale.US, "fx: %f,", fx4);
        }
        return "";
    }

    private String generateJSfy4() {
        if (fy4 != null) {
            return String.format(Locale.US, "fy: %f,", fy4);
        }
        return "";
    }

    private String generateJSimageSettings4() {
        if (imageSettings4 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings4 != null) ? imageSettings4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState20() {
        if (patternFillOrTypeOrState20 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState20 != null) ? patternFillOrTypeOrState20.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState21() {
        if (patternFillOrTypeOrState21 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState21 != null) ? patternFillOrTypeOrState21.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState22() {
        if (patternFillOrTypeOrState22 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState22 != null) ? patternFillOrTypeOrState22.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState23() {
        if (patternFillOrTypeOrState23 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", patternFillOrTypeOrState23);
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState24() {
        if (patternFillOrTypeOrState24 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %b,", patternFillOrTypeOrState24);
        }
        return "";
    }

    private String generateJScolor19() {
        if (color19 != null) {
            return String.format(Locale.US, "color: %s,", color19);
        }
        return "";
    }

    private String generateJSthickness7() {
        if (thickness7 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness7);
        }
        return "";
    }

    private String generateJSsize4() {
        if (size4 != null) {
            return String.format(Locale.US, "size: %f,", size4);
        }
        return "";
    }

    private String generateJSselectLabels() {
        if (selectLabels != null) {
            return String.format(Locale.US, "selectLabels: %s,", selectLabels);
        }
        return "";
    }

    private String generateJSselectLabels1() {
        if (selectLabels1 != null) {
            return String.format(Locale.US, "selectLabels: %b,", selectLabels1);
        }
        return "";
    }

    private String generateJSselectMarkers() {
        if (selectMarkers != null) {
            return String.format(Locale.US, "selectMarkers: %s,", selectMarkers);
        }
        return "";
    }

    private String generateJSselectMarkers1() {
        if (selectMarkers1 != null) {
            return String.format(Locale.US, "selectMarkers: %b,", selectMarkers1);
        }
        return "";
    }

    private String generateJSselectMarkers2() {
        if (selectMarkers2 != null) {
            return String.format(Locale.US, "selectMarkers: %s,", selectMarkers2);
        }
        return "";
    }

    private String generateJSselectNegativeFill() {
        if (selectNegativeFill != null) {
            return String.format(Locale.US, "selectNegativeFill: %s,", (selectNegativeFill != null) ? selectNegativeFill.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor20() {
        if (color20 != null) {
            return String.format(Locale.US, "color: %s,", color20);
        }
        return "";
    }

    private String generateJSopacity15() {
        if (opacity15 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity15);
        }
        return "";
    }

    private String generateJSkeys20() {
        if (keys20 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys20));
        }
        return "";
    }

    private String generateJSkeys21() {
        if (keys21 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys21));
        }
        return "";
    }

    private String generateJSangle5() {
        if (angle5 != null) {
            return String.format(Locale.US, "angle: %f,", angle5);
        }
        return "";
    }

    private String generateJSmode20() {
        if (mode20 != null) {
            return String.format(Locale.US, "mode: %b,", mode20);
        }
        return "";
    }

    private String generateJSmode21() {
        if (mode21 != null) {
            return String.format(Locale.US, "mode: %s,", (mode21 != null) ? mode21.generateJs() : "null");
        }
        return "";
    }

    private String generateJSmode22() {
        if (mode22 != null) {
            return String.format(Locale.US, "mode: %s,", mode22);
        }
        return "";
    }

    private String generateJSopacity16() {
        if (opacity16 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity16);
        }
        return "";
    }

    private String generateJSkeys22() {
        if (keys22 != null) {
            return String.format(Locale.US, "keys: %s,", arrayToString(keys22));
        }
        return "";
    }

    private String generateJSkeys23() {
        if (keys23 != null) {
            return String.format(Locale.US, "keys: %s,", Arrays.toString(keys23));
        }
        return "";
    }

    private String generateJScx5() {
        if (cx5 != null) {
            return String.format(Locale.US, "cx: %f,", cx5);
        }
        return "";
    }

    private String generateJScy5() {
        if (cy5 != null) {
            return String.format(Locale.US, "cy: %f,", cy5);
        }
        return "";
    }

    private String generateJSmode23() {
        if (mode23 != null) {
            return String.format(Locale.US, "mode: %s,", (mode23 != null) ? mode23.generateJs() : "null");
        }
        return "";
    }

    private String generateJSopacity17() {
        if (opacity17 != null) {
            return String.format(Locale.US, "opacity: %f,", opacity17);
        }
        return "";
    }

    private String generateJSfx5() {
        if (fx5 != null) {
            return String.format(Locale.US, "fx: %f,", fx5);
        }
        return "";
    }

    private String generateJSfy5() {
        if (fy5 != null) {
            return String.format(Locale.US, "fy: %f,", fy5);
        }
        return "";
    }

    private String generateJSimageSettings5() {
        if (imageSettings5 != null) {
            return String.format(Locale.US, "imageSettings: %s,", (imageSettings5 != null) ? imageSettings5.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState25() {
        if (patternFillOrTypeOrState25 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState25 != null) ? patternFillOrTypeOrState25.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState26() {
        if (patternFillOrTypeOrState26 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState26 != null) ? patternFillOrTypeOrState26.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState27() {
        if (patternFillOrTypeOrState27 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", (patternFillOrTypeOrState27 != null) ? patternFillOrTypeOrState27.generateJs() : "null");
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState28() {
        if (patternFillOrTypeOrState28 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %s,", patternFillOrTypeOrState28);
        }
        return "";
    }

    private String generateJSpatternFillOrTypeOrState29() {
        if (patternFillOrTypeOrState29 != null) {
            return String.format(Locale.US, "patternFillOrTypeOrState: %b,", patternFillOrTypeOrState29);
        }
        return "";
    }

    private String generateJScolor21() {
        if (color21 != null) {
            return String.format(Locale.US, "color: %s,", color21);
        }
        return "";
    }

    private String generateJSthickness8() {
        if (thickness8 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness8);
        }
        return "";
    }

    private String generateJSsize5() {
        if (size5 != null) {
            return String.format(Locale.US, "size: %f,", size5);
        }
        return "";
    }

    private String generateJScolor22() {
        if (color22 != null) {
            return String.format(Locale.US, "color: %s,", (color22 != null) ? color22.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor23() {
        if (color23 != null) {
            return String.format(Locale.US, "color: %s,", (color23 != null) ? color23.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor24() {
        if (color24 != null) {
            return String.format(Locale.US, "color: %s,", color24);
        }
        return "";
    }

    private String generateJSthickness9() {
        if (thickness9 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness9);
        }
        return "";
    }

    private String generateJSdashpattern3() {
        if (dashpattern3 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern3);
        }
        return "";
    }

    private String generateJSlineJoin3() {
        if (lineJoin3 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin3 != null) ? lineJoin3.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap3() {
        if (lineCap3 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap3 != null) ? lineCap3.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor25() {
        if (color25 != null) {
            return String.format(Locale.US, "color: %s,", (color25 != null) ? color25.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor26() {
        if (color26 != null) {
            return String.format(Locale.US, "color: %s,", (color26 != null) ? color26.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor27() {
        if (color27 != null) {
            return String.format(Locale.US, "color: %s,", color27);
        }
        return "";
    }

    private String generateJSthickness10() {
        if (thickness10 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness10);
        }
        return "";
    }

    private String generateJSdashpattern4() {
        if (dashpattern4 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern4);
        }
        return "";
    }

    private String generateJSlineJoin4() {
        if (lineJoin4 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin4 != null) ? lineJoin4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap4() {
        if (lineCap4 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap4 != null) ? lineCap4.generateJs() : "null");
        }
        return "";
    }

    private String generateJSselectionMode() {
        if (selectionMode != null) {
            return String.format(Locale.US, "selectionMode: %s,", (selectionMode != null) ? selectionMode.generateJs() : "null");
        }
        return "";
    }

    private String generateJSselectionMode1() {
        if (selectionMode1 != null) {
            return String.format(Locale.US, "selectionMode: %s,", selectionMode1);
        }
        return "";
    }

    private String generateJScolor28() {
        if (color28 != null) {
            return String.format(Locale.US, "color: %s,", (color28 != null) ? color28.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor29() {
        if (color29 != null) {
            return String.format(Locale.US, "color: %s,", (color29 != null) ? color29.generateJs() : "null");
        }
        return "";
    }

    private String generateJScolor30() {
        if (color30 != null) {
            return String.format(Locale.US, "color: %s,", color30);
        }
        return "";
    }

    private String generateJSthickness11() {
        if (thickness11 != null) {
            return String.format(Locale.US, "thickness: %f,", thickness11);
        }
        return "";
    }

    private String generateJSdashpattern5() {
        if (dashpattern5 != null) {
            return String.format(Locale.US, "dashpattern: %s,", dashpattern5);
        }
        return "";
    }

    private String generateJSlineJoin5() {
        if (lineJoin5 != null) {
            return String.format(Locale.US, "lineJoin: %s,", (lineJoin5 != null) ? lineJoin5.generateJs() : "null");
        }
        return "";
    }

    private String generateJSlineCap5() {
        if (lineCap5 != null) {
            return String.format(Locale.US, "lineCap: %s,", (lineCap5 != null) ? lineCap5.generateJs() : "null");
        }
        return "";
    }

    private String generateJStooltip() {
        if (tooltip != null) {
            return String.format(Locale.US, "tooltip: %s,", tooltip);
        }
        return "";
    }

    private String generateJStooltip1() {
        if (tooltip1 != null) {
            return String.format(Locale.US, "tooltip: %b,", tooltip1);
        }
        return "";
    }

    private String generateJStop() {
        if (top != null) {
            return String.format(Locale.US, "top: %f,", top);
        }
        return "";
    }

    private String generateJStop1() {
        if (top1 != null) {
            return String.format(Locale.US, "top: %s,", top1);
        }
        return "";
    }

    private String generateJSxCoord() {
        if (xCoord != null) {
            return String.format(Locale.US, "xCoord: %f,", xCoord);
        }
        return "";
    }

    private String generateJSyCoord() {
        if (yCoord != null) {
            return String.format(Locale.US, "yCoord: %f,", yCoord);
        }
        return "";
    }

    private String generateJSindexOrIndexes() {
        if (indexOrIndexes != null) {
            return String.format(Locale.US, "indexOrIndexes: %f,", indexOrIndexes);
        }
        return "";
    }

    private String generateJSindexOrIndexes1() {
        if (indexOrIndexes1 != null) {
            return String.format(Locale.US, "indexOrIndexes: %s,", Arrays.toString(indexOrIndexes1));
        }
        return "";
    }

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: %s,", type3);
        }
        return "";
    }

    private String generateJSuseCapture2() {
        if (useCapture2 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture2);
        }
        return "";
    }

    private String generateJSlistenerScope2() {
        if (listenerScope2 != null) {
            return String.format(Locale.US, "listenerScope: %s,", listenerScope2);
        }
        return "";
    }

    private String generateJSkey2() {
        if (key2 != null) {
            return String.format(Locale.US, "key: %s,", key2);
        }
        return "";
    }

    private String generateJSindex3() {
        if (index3 != null) {
            return String.format(Locale.US, "index: %f,", index3);
        }
        return "";
    }

    private String generateJSindexes9() {
        if (indexes9 != null) {
            return String.format(Locale.US, "indexes: %s,", Arrays.toString(indexes9));
        }
        return "";
    }

    private String generateJSwidth2() {
        if (width2 != null) {
            return String.format(Locale.US, "width: %f,", width2);
        }
        return "";
    }

    private String generateJSwidth3() {
        if (width3 != null) {
            return String.format(Locale.US, "width: %s,", width3);
        }
        return "";
    }

    private String generateJSzIndex() {
        if (zIndex != null) {
            return String.format(Locale.US, "zIndex: %f,", zIndex);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        if (jsBase == null) {
            js.append("{");
            js.append(generateJSbottom());
            js.append(generateJSbottom1());
            js.append(generateJSbounds());
            js.append(generateJSbounds1());
            js.append(generateJSbounds2());
            js.append(generateJSx());
            js.append(generateJSx1());
            js.append(generateJSy());
            js.append(generateJSy1());
            js.append(generateJSwidth());
            js.append(generateJSwidth1());
            js.append(generateJSheight());
            js.append(generateJSheight1());
            js.append(generateJScolor());
            js.append(generateJSdata());
            js.append(generateJSdata1());
            js.append(generateJSdata2());
            js.append(generateJSdata3());
            js.append(generateJScsvSettings());
            js.append(generateJScsvSettings1());
            js.append(generateJSdisplayNegative());
            js.append(generateJSenabled());
            js.append(generateJSindexes());
            js.append(generateJSindexes1());
            js.append(generateJSfill());
            js.append(generateJScolor1());
            js.append(generateJSopacity());
            js.append(generateJSkeys());
            js.append(generateJSkeys1());
            js.append(generateJSangle());
            js.append(generateJSmode());
            js.append(generateJSmode1());
            js.append(generateJSmode2());
            js.append(generateJSopacity1());
            js.append(generateJSkeys2());
            js.append(generateJSkeys3());
            js.append(generateJScx());
            js.append(generateJScy());
            js.append(generateJSmode3());
            js.append(generateJSopacity2());
            js.append(generateJSfx());
            js.append(generateJSfy());
            js.append(generateJSimageSettings());
            js.append(generateJSgeoIdField());
            js.append(generateJSindex());
            js.append(generateJSkey());
            js.append(generateJSkey1());
            js.append(generateJSpatternFillOrTypeOrState());
            js.append(generateJSpatternFillOrTypeOrState1());
            js.append(generateJSpatternFillOrTypeOrState2());
            js.append(generateJSpatternFillOrTypeOrState3());
            js.append(generateJSpatternFillOrTypeOrState4());
            js.append(generateJScolor2());
            js.append(generateJSthickness());
            js.append(generateJSsize());
            js.append(generateJSheight2());
            js.append(generateJSheight3());
            js.append(generateJSindex1());
            js.append(generateJSindexes2());
            js.append(generateJShoverFill());
            js.append(generateJScolor3());
            js.append(generateJSopacity3());
            js.append(generateJSkeys4());
            js.append(generateJSkeys5());
            js.append(generateJSangle1());
            js.append(generateJSmode4());
            js.append(generateJSmode5());
            js.append(generateJSmode6());
            js.append(generateJSopacity4());
            js.append(generateJSkeys6());
            js.append(generateJSkeys7());
            js.append(generateJScx1());
            js.append(generateJScy1());
            js.append(generateJSmode7());
            js.append(generateJSopacity5());
            js.append(generateJSfx1());
            js.append(generateJSfy1());
            js.append(generateJSimageSettings1());
            js.append(generateJSpatternFillOrTypeOrState5());
            js.append(generateJSpatternFillOrTypeOrState6());
            js.append(generateJSpatternFillOrTypeOrState7());
            js.append(generateJSpatternFillOrTypeOrState8());
            js.append(generateJSpatternFillOrTypeOrState9());
            js.append(generateJScolor4());
            js.append(generateJSthickness1());
            js.append(generateJSsize1());
            js.append(generateJShoverLabels());
            js.append(generateJShoverLabels1());
            js.append(generateJShoverMarkers());
            js.append(generateJShoverMarkers1());
            js.append(generateJShoverMarkers2());
            js.append(generateJShoverNegativeFill());
            js.append(generateJScolor5());
            js.append(generateJSopacity6());
            js.append(generateJSkeys8());
            js.append(generateJSkeys9());
            js.append(generateJSangle2());
            js.append(generateJSmode8());
            js.append(generateJSmode9());
            js.append(generateJSmode10());
            js.append(generateJSopacity7());
            js.append(generateJSkeys10());
            js.append(generateJSkeys11());
            js.append(generateJScx2());
            js.append(generateJScy2());
            js.append(generateJSmode11());
            js.append(generateJSopacity8());
            js.append(generateJSfx2());
            js.append(generateJSfy2());
            js.append(generateJSimageSettings2());
            js.append(generateJSpatternFillOrTypeOrState10());
            js.append(generateJSpatternFillOrTypeOrState11());
            js.append(generateJSpatternFillOrTypeOrState12());
            js.append(generateJSpatternFillOrTypeOrState13());
            js.append(generateJSpatternFillOrTypeOrState14());
            js.append(generateJScolor6());
            js.append(generateJSthickness2());
            js.append(generateJSsize2());
            js.append(generateJScolor7());
            js.append(generateJScolor8());
            js.append(generateJScolor9());
            js.append(generateJSthickness3());
            js.append(generateJSdashpattern());
            js.append(generateJSlineJoin());
            js.append(generateJSlineCap());
            js.append(generateJScolor10());
            js.append(generateJScolor11());
            js.append(generateJScolor12());
            js.append(generateJSthickness4());
            js.append(generateJSdashpattern1());
            js.append(generateJSlineJoin1());
            js.append(generateJSlineCap1());
            js.append(generateJSid());
            js.append(generateJSid1());
            js.append(generateJSindexes3());
            js.append(generateJSindexes4());
            js.append(generateJSindexes5());
            js.append(generateJSindexes6());
            js.append(generateJSlabels());
            js.append(generateJSlabels1());
            js.append(generateJSleft());
            js.append(generateJSleft1());
            js.append(generateJSlegendItem());
            js.append(generateJStype());
            js.append(generateJSuseCapture());
            js.append(generateJSlistenerScope());
            js.append(generateJStype1());
            js.append(generateJSuseCapture1());
            js.append(generateJSlistenerScope1());
            js.append(generateJSmarkers());
            js.append(generateJSmarkers1());
            js.append(generateJSmarkers2());
            js.append(generateJSmaxHeight());
            js.append(generateJSmaxHeight1());
            js.append(generateJSmaxWidth());
            js.append(generateJSmaxWidth1());
            js.append(generateJSminHeight());
            js.append(generateJSminHeight1());
            js.append(generateJSminWidth());
            js.append(generateJSminWidth1());
            js.append(generateJSname());
            js.append(generateJSnegativeFill());
            js.append(generateJScolor13());
            js.append(generateJSopacity9());
            js.append(generateJSkeys12());
            js.append(generateJSkeys13());
            js.append(generateJSangle3());
            js.append(generateJSmode12());
            js.append(generateJSmode13());
            js.append(generateJSmode14());
            js.append(generateJSopacity10());
            js.append(generateJSkeys14());
            js.append(generateJSkeys15());
            js.append(generateJScx3());
            js.append(generateJScy3());
            js.append(generateJSmode15());
            js.append(generateJSopacity11());
            js.append(generateJSfx3());
            js.append(generateJSfy3());
            js.append(generateJSimageSettings3());
            js.append(generateJSpatternFillOrTypeOrState15());
            js.append(generateJSpatternFillOrTypeOrState16());
            js.append(generateJSpatternFillOrTypeOrState17());
            js.append(generateJSpatternFillOrTypeOrState18());
            js.append(generateJSpatternFillOrTypeOrState19());
            js.append(generateJScolor14());
            js.append(generateJSthickness5());
            js.append(generateJSsize3());
            js.append(generateJScolor15());
            js.append(generateJScolor16());
            js.append(generateJScolor17());
            js.append(generateJSthickness6());
            js.append(generateJSdashpattern2());
            js.append(generateJSlineJoin2());
            js.append(generateJSlineCap2());
            js.append(generateJSoverlapMode());
            js.append(generateJSoverlapMode1());
            js.append(generateJSoverlapMode2());
            js.append(generateJSpaperSizeOrOptions());
            js.append(generateJSpaperSizeOrOptions1());
            js.append(generateJSlandscape());
            js.append(generateJStype2());
            js.append(generateJSright());
            js.append(generateJSright1());
            js.append(generateJSindex2());
            js.append(generateJSindexes7());
            js.append(generateJSindexes8());
            js.append(generateJSselectFill());
            js.append(generateJScolor18());
            js.append(generateJSopacity12());
            js.append(generateJSkeys16());
            js.append(generateJSkeys17());
            js.append(generateJSangle4());
            js.append(generateJSmode16());
            js.append(generateJSmode17());
            js.append(generateJSmode18());
            js.append(generateJSopacity13());
            js.append(generateJSkeys18());
            js.append(generateJSkeys19());
            js.append(generateJScx4());
            js.append(generateJScy4());
            js.append(generateJSmode19());
            js.append(generateJSopacity14());
            js.append(generateJSfx4());
            js.append(generateJSfy4());
            js.append(generateJSimageSettings4());
            js.append(generateJSpatternFillOrTypeOrState20());
            js.append(generateJSpatternFillOrTypeOrState21());
            js.append(generateJSpatternFillOrTypeOrState22());
            js.append(generateJSpatternFillOrTypeOrState23());
            js.append(generateJSpatternFillOrTypeOrState24());
            js.append(generateJScolor19());
            js.append(generateJSthickness7());
            js.append(generateJSsize4());
            js.append(generateJSselectLabels());
            js.append(generateJSselectLabels1());
            js.append(generateJSselectMarkers());
            js.append(generateJSselectMarkers1());
            js.append(generateJSselectMarkers2());
            js.append(generateJSselectNegativeFill());
            js.append(generateJScolor20());
            js.append(generateJSopacity15());
            js.append(generateJSkeys20());
            js.append(generateJSkeys21());
            js.append(generateJSangle5());
            js.append(generateJSmode20());
            js.append(generateJSmode21());
            js.append(generateJSmode22());
            js.append(generateJSopacity16());
            js.append(generateJSkeys22());
            js.append(generateJSkeys23());
            js.append(generateJScx5());
            js.append(generateJScy5());
            js.append(generateJSmode23());
            js.append(generateJSopacity17());
            js.append(generateJSfx5());
            js.append(generateJSfy5());
            js.append(generateJSimageSettings5());
            js.append(generateJSpatternFillOrTypeOrState25());
            js.append(generateJSpatternFillOrTypeOrState26());
            js.append(generateJSpatternFillOrTypeOrState27());
            js.append(generateJSpatternFillOrTypeOrState28());
            js.append(generateJSpatternFillOrTypeOrState29());
            js.append(generateJScolor21());
            js.append(generateJSthickness8());
            js.append(generateJSsize5());
            js.append(generateJScolor22());
            js.append(generateJScolor23());
            js.append(generateJScolor24());
            js.append(generateJSthickness9());
            js.append(generateJSdashpattern3());
            js.append(generateJSlineJoin3());
            js.append(generateJSlineCap3());
            js.append(generateJScolor25());
            js.append(generateJScolor26());
            js.append(generateJScolor27());
            js.append(generateJSthickness10());
            js.append(generateJSdashpattern4());
            js.append(generateJSlineJoin4());
            js.append(generateJSlineCap4());
            js.append(generateJSselectionMode());
            js.append(generateJSselectionMode1());
            js.append(generateJScolor28());
            js.append(generateJScolor29());
            js.append(generateJScolor30());
            js.append(generateJSthickness11());
            js.append(generateJSdashpattern5());
            js.append(generateJSlineJoin5());
            js.append(generateJSlineCap5());
            js.append(generateJStooltip());
            js.append(generateJStooltip1());
            js.append(generateJStop());
            js.append(generateJStop1());
            js.append(generateJSxCoord());
            js.append(generateJSyCoord());
            js.append(generateJSindexOrIndexes());
            js.append(generateJSindexOrIndexes1());
            js.append(generateJStype3());
            js.append(generateJSuseCapture2());
            js.append(generateJSlistenerScope2());
            js.append(generateJSkey2());
            js.append(generateJSindex3());
            js.append(generateJSindexes9());
            js.append(generateJSwidth2());
            js.append(generateJSwidth3());
            js.append(generateJSzIndex());
            js.append("}");
        }
            js.append(generateJSgetBounds());
            js.append(generateJSgetData());
            js.append(generateJSgetHatchFill());
            js.append(generateJSgetHoverHatchFill());
            js.append(generateJSgetHoverLabels());
            js.append(generateJSgetHoverMarkers());
            js.append(generateJSgetHoverNegativeHatchFill());
            js.append(generateJSgetHoverNegativeStroke());
            js.append(generateJSgetLabels());
            js.append(generateJSgetLegendItem());
            js.append(generateJSgetMarkers());
            js.append(generateJSgetNegativeHatchFill());
            js.append(generateJSgetNegativeStroke());
            js.append(generateJSgetSelectHatchFill());
            js.append(generateJSgetSelectLabels());
            js.append(generateJSgetSelectMarkers());
            js.append(generateJSgetSelectNegativeHatchFill());
            js.append(generateJSgetSelectNegativeStroke());
            js.append(generateJSgetTooltip());

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}