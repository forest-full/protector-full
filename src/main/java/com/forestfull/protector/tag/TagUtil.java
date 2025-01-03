package com.forestfull.protector.tag;

import org.springframework.util.ObjectUtils;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * <a href="https://regexr.com">https://regexr.com</a>
 */
class TagUtil {

    protected static Object convertToListMap(Object tagObject) {
        if (ObjectUtils.isEmpty(tagObject)) return null;

//        List<Map<String, Object>> list = new LinkedList<>();

        if (tagObject instanceof String) {
            final String tagString = String.valueOf(tagObject);
            final String findStartTag = "<";

            if (!tagString.contains(findStartTag)) return tagObject;

            final List<Object> list = new LinkedList<>();

            for (int i = 0; i < tagString.length(); i++) {
                if (!findStartTag.equals(tagString.substring(i, i + 1))) continue;


            }

            return null;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        convertToListMap("<div class=\"exp-group-0\"><code class=\"token exp-group\">(</code> <b>Capturing group #1.</b> Groups multiple tokens together and creates a capture group for extracting a substring or using a backreference.<div class=\"exp-group-set\"><code class=\"token exp-set\">[</code> <br/><b>Character set.</b> Match any character in the set.<div class=\"\"><code class=\"token exp-set\"><span class=\"exp-char\">A</span>-<span class=\"exp-char\">Z</span></code> <b>Range.</b> Matches a character in the range \"A\" to \"Z\" (char code 65 to 90). Case sensitive.</div><div class=\"close\"><code class=\"token exp-set\">]</code> &nbsp;</div></div><div class=\"close\"><code class=\"token exp-group\">)</code> &nbsp;</div></div>");


    }

}
