/*
 * jQuery File Upload Plugin JS Example 8.2
 * https://github.com/blueimp/jQuery-File-Upload
 *
 * Copyright 2010, Sebastian Tschan
 * https://blueimp.net
 *
 * Licensed under the MIT license:
 * http://www.opensource.org/licenses/MIT
 */

/*jslint nomen: true, regexp: true */
/*global $, window, navigator, blueimp */

$(function() {
	'use strict';

	// Initialize the jQuery File Upload widget:
	$('#fileupload').fileupload({
		// Uncomment the following to send cross-domain cookies:
		// xhrFields: {withCredentials: true},
		url : '../upload/'
	});

	// Enable iframe cross-domain access via redirect option:
	$('#fileupload').fileupload('option', 'redirect',
			window.location.href.replace(/\/[^\/]*$/, '/cors/result.html?%s'));

	// Load existing files:
	$('#fileupload').addClass('fileupload-processing');
	$.ajax({
		// Uncomment the following to send cross-domain cookies:
		// xhrFields: {withCredentials: true},
		url : $('#fileupload').fileupload('option', 'url'),
		dataType : 'json',
		context : $('#fileupload')[0]
	}).always(function() {
		$(this).removeClass('fileupload-processing');
	}).done(function(result) {
		$(this).fileupload('option', 'done').call(this, null, {
			result : result
		});
	});

	// Show the blueimp Gallery as lightbox when clicking on image links:
	$('#fileupload .files').on('click', '.gallery', function(event) {
		// The :even filter removes duplicate links (thumbnail and file name
		// links):
		if (blueimp.Gallery($('#fileupload .gallery').filter(':even'), {
			index : this
		})) {
			// Prevent the default link action on
			// successful Gallery initialization:
			event.preventDefault();
		}
	});


	// 绑定回调，添加日历控件
	$('#fileupload').bind('fileuploadadded', function(e, data) {
		datepick();
	});
	
	// 绑定非图片数据
	$('#fileupload').bind('fileuploadsubmit', function (e, data) {
	    var inputs = data.context.find(':input');
	    if (inputs.filter('[required][value=""]').first().focus().length) {
	        return false;
	    }
	    data.formData = inputs.serializeArray();
	});
	
});
