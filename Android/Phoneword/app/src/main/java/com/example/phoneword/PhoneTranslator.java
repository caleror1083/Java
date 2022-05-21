// Robert Calero
// Phoneword app - Android Studio - Java

package com.example.phoneword;

import android.text.Editable;
import java.lang.*;
import java.lang.CharSequence;
import java.lang.StringBuilder;
import java.util.Locale;

public class PhoneTranslator
{
    public static String ToNumber(Editable raw)
        {
            if (!isNullOrWhiteSpace(raw))
                {
                    return "";
                }
            else
                {
                    raw = raw.toUpperCase(Locale.ROOT);
                }

            StringBuilder newNumber = new StringBuilder();

            for (char c : raw.toCharArray())
                {
                    if (" -0123456789".contains(c))
                        {
                            newNumber.append(c);
                        }
                    else
                        {
                            Integer result = TranslateToNumber(c);
                            if (result != null)
                                {
                                    newNumber.append(result);
                                }
                        }
                    // otherwise we've skipped a non-numeric char
                }
            return newNumber.toString();
        }

        private static boolean Contains(String keyString, char c)
            {
                return keyString.indexOf(c) >= 0;
            }

        private static Integer TranslateToNumber(char c)
            {
                if (PhoneTranslator.Contains("ABC", c))
                    {
                        return 2;
                    }
                else if (PhoneTranslator.Contains("DEF", c))
                    {
                        return 3;
                    }
                else if (PhoneTranslator.Contains("GHI", c))
                    {
                        return 4;
                    }
                else if (PhoneTranslator.Contains("JKL", c))
                    {
                        return 5;
                    }
                else if (PhoneTranslator.Contains("MNO", c))
                    {
                        return 6;
                    }
                else if (PhoneTranslator.Contains("PQRS", c))
                    {
                        return 7;
                    }
                else if (PhoneTranslator.Contains("TUV", c))
                    {
                        return 8;
                    }
                else if (PhoneTranslator.Contains("WXYZ", c))
                    {
                        return 9;
                    }
                return null;
            }

    public static boolean isNullOrWhiteSpace(Editable string)
    {
        if (string == null)
        {
            return true;
        }

        for (int index = 0; index < string.length(); index++)
        {
            if (!Character.isWhitespace(string.charAt(index)))
            {
                return false;
            }
        }
        return true;
    }
    }