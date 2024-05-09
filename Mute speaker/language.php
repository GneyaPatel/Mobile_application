<!-- <?php
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
	// Get the API key, source language, target language, and text to translate from the form
	$apiKey = $_POST['api-key'];
	$sourceLanguage = $_POST['source-language'];
	$targetLanguage = $_POST['target-language'];
	$textToTranslate = $_POST['text-to-translate'];

	// Construct the API URL
	$apiUrl = "https://translation.googleapis.com/language/translate/v2?key=$apiKey&q=" . urlencode($textToTranslate) . "&source=$sourceLanguage&target=$targetLanguage";

	// Call the API using cURL
	$ch = curl_init();
	curl_setopt($ch, CURLOPT_URL, $apiUrl);
	curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
	$response = curl_exec($ch);
	curl_close($ch);

	// Parse the JSON response and get the translated text
	$data = json_decode($response, true);
	$translatedText = $data['data']['translations'][0]['translatedText'];

	// Output the translated text
	echo $translatedText
}  -->

<div id="google_translate_element"></div>
<script>
    function googleTranslateElementInit() {
        new google.translate.TranslateElement(
            {pageLanguage: 'en'},
            'google_translate_element'
        );
    }
</script>
<script src="http://translate.google.com/translate_a/element.js?cb=googleTranslateElementInit"></script>