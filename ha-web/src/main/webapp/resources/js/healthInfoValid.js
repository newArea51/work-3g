(function() {
	// 標準エラーメッセージの変更
	$.extend($.validator.messages, {
		required : '*入力必須です'
	});

	// 入力項目の検証ルール定義
	var rules = {
		height : {
			required : true
		},
		weight : {
			required : true
		}
	};

	// 入力項目ごとのエラーメッセージ定義
	var messages = {
		height : {
			required : "身長が未入力です"
		},
		weight : {
			required : "体重が未入力です"
		}
	};

	$(function() {
		var formId = $('form').attr('id');
		$(formId).validate({
			rules : rules,
			messages : messages,

			// エラーメッセージ出力箇所調整
			errorPlacement : function(error, element) {
				if (element.is(':radio')) {
					error.appendTo(element.parent());
				} else {
					error.insertAfter(element);
				}
			}
		});
	});

})();