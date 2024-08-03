function changeLang(){
  let selectBox = document.getElementById('selectLanguages').value;
 
  let japanese = document.getElementById('jpn1');
  let english = document.getElementById('eng1');


  if(selectBox === 'jpn'){
      japanese.style.display = 'table-row';
      english.style.display = 'none';
  } else if (selectBox === 'en'){
      japanese.style.display = 'none';
      english.style.display = 'table-row';
  } else if (selectBox === 'all'){
      japanese.style.display = 'table-row';
      english.style.display = 'table-row';
  }

}