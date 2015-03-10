require "rubygems"
require "sinatra/base"
require "sinatra/reloader"

class App < Sinatra::Base
  register Sinatra::Reloader
  set :public_folder, File.dirname(__FILE__) + '/public'

  get '/.?:url?' do
    @url = params[:url]
    erb :index
  end
end
