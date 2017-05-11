package org.mallo.web.util;

import org.springframework.util.StringUtils;

public class TruncateUtil 
{
	private final static String MSG_TEXT = " ... (truncated) ... ";
	
	
	/**
	 * A helper method to truncate input text based on the specified maxLen
	 * 
	 * @param message value
	 * @param maxLen of the message
	 * @return
	 */
	public static String truncate(String message, int maxLen) 
	{
		int replaceLen = MSG_TEXT.length();
		
		// Return the original message for the below condition:
		// 1. the specified maxLen is negative
		// 2. the length of message is less than maxLen value
		// 3. maxLen value is less than the length of the REPLACEMENT text message
		if ( maxLen <= 0 
				|| StringUtils.isEmpty(message) 
				|| (message.length() <= maxLen)
				|| (message.length() <= replaceLen) ) {
			return message;
		}
	
		StringBuilder sb = new StringBuilder();
		
		// Identify the number of characters to be taken from the left side and right side of message value
		int counts = maxLen - replaceLen;
		int leftSubStrLen 	= counts / 2;
		int rightSubStrLen  = counts - leftSubStrLen;

		sb.append(message.substring(0, 2))
		  .append(MSG_TEXT)
		  .append(message.substring(message.length() - rightSubStrLen));
		
		return sb.toString();
	}
}
